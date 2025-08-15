# override Busybox defconfig with our own

# search our filepath before the filepath of the source recipe
FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

SRC_URI += "file://defconfig \
            "
