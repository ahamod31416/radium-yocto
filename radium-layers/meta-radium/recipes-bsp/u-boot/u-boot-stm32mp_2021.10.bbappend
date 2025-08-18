FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI += "file://001-add-device-tree-for-radium-bsp.patch \
            file://002-add-defconfig-for-radium-bsp.patch \
            file://003-resolve-u-boot-stop-error.patch \
            file://004-add-custom-boot-command.patch \
"
