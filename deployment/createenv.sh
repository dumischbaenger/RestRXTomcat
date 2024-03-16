#!/usr/bin/env bash

#set -xu

SCRIPT_DIR="$(dirname "$(readlink -f "$0")")"

PATH=$PATH:"$SCRIPT_DIR/glassfish7/bin/"
