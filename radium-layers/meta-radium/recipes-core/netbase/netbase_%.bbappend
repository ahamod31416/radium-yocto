# search our filepath before the filepath of the source recipe
FILESEXTRAPATHS:prepend := "${THISDIR}/netbase-${PV}:"

SRC_URI += "file://interfaces \
            "
