#!/bin/bash

if [[ "{{cookiecutter.version_control}}" == "git" ]]; then
    set +x
    echo "Initializing git repo"

    set -x
    if [[ -z "$GIT" ]]; then
        GIT="$(which git)"
    fi

    if [[ ! -z "$GIT" && -x "$GIT" ]]; then
        "$GIT" init
        "$GIT" add .
        "$GIT" commit -a -m "Initial import"
        echo "add devcontainer sub-module"
    else
        echo "WARNING: git requested, but git binary not found" >&2
    fi
fi

