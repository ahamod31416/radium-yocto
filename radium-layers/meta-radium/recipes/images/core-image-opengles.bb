#s
#
DESCRIPTION = "Minimal image with libgles"

IMAGE_INSTALL = "task-core-boot ${ROOTFS_PKGMANAGE_BOOTSTRAP} ${CORE_IMAGE_EXTRA_INSTALL}"

IMAGE_INSTALL += " \
libgles-omap3 \
libgles-omap3-rawdemos \
"

LICENSE = "MIT"

inherit core-image
