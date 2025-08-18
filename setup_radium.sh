#!/bin/sh

cd radium-layers
repo init -u . -m manifest.xml
repo sync
