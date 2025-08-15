DESCRIPTION = "Version 1.0-r1 of the qtr3-demo-image."
LICENSE = "MIT"
PR="r1"

LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=3f40d7994397109285ec7b81fdeb3b58 \
                    file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

DEPENDS += "task-qt5-slim"

RDEPENDS_${PN} += " \
	task-qt5-slim-base \
	"

IMAGE_INSTALL += "\
	${CORE_IMAGE_BASE_INSTALL} \
	module-init-tools \
	task-qt5-slim-base \
	dosfstools \
	e2fsprogs \
	mtd-utils \
	genext2fs \
	gdbserver \
"

inherit core-image

