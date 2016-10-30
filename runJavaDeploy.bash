#!/bin/bash

echo "Deploying all modules to our global repo"

# make sure the variables are set
if [ -z ${BB_USERNAME+x} ]; then
    echo "git username is unset"
    exit
else
    echo "git username is set to '$BB_USERNAME'"
fi

if [ -z ${BB_PASSWORD+x} ]; then
    echo "git password is unset"
    exit
else
    echo "git password is set to '$BB_PASSWORD'"
fi

if [ -z ${OPENSSL_PWD+x} ]; then
    echo "openSSL password is unset"
    exit
else
    echo "openSSL password is set to '$OPENSSL_PWD'"
fi

if [ -f "private-key.gpg.enc" ]; then
    echo "openSSL excryption key is set"
else
    echo "Cannot find openSSL encryption key."
    exit
fi

function initModule {
    # Init-ing git or it will complain when we deploy
    git config --global user.email "bjorn@harvold.com"
    git config --global user.name "Bjorn Harvold"

    # Digitally signing every artifact using this key
    openssl aes-256-cbc -pass pass:${OPENSSL_PWD} -in private-key.gpg.enc -out private-key.gpg -d
    gpg --import private-key.gpg
}

function testModule {
    mvn -B install
    STATUS=$?
    if [ $STATUS -ne 0 ]; then
        echo "Something went wrong on line: ${BASH_LINENO[*]}"
        cd ..
        exit 1
    fi
}

function deployModule {
    echo "Checking out develop branch and deploying"
    mvn -B -s settings.xml deploy -Dmaven.test.skip=true
    STATUS=$?
    if [ $STATUS -ne 0 ]; then
        echo "Something went wrong on line: ${BASH_LINENO[*]}"
        cd ..
        exit 1
    fi
}

echo "Deploying Maven module:..."

initModule
testModule
deployModule
