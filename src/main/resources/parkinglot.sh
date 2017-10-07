#!/usr/bin/env bash
PARKINGLOT_HOME="$(cd "`dirname "$0"`"/..; pwd)"
java -jar $PARKINGLOT_HOME/parkinglot-1.0-SNAPSHOT.jar $@