FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI += "file://001-custom-device-treee-radium-bsp.patch \
            file://002-radium-bsp-modify-nor-flash.patch \
            file://003-increase-regulator-no.patch \
"
