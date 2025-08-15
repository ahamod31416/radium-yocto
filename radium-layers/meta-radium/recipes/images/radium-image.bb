DESCRIPTION = "radium Developer Kit image configuration"
LICENSE = "MIT"
PR="r1"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302\
                    file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

# common tasks and packages for radium devkit
DEPENDS += "\
	packagegroup-qt5-slim \
	"

RDEPENDS_${PN} += " \
	packagegroup-qt5-slim \
	"

IMAGE_INSTALL = "\
	packagegroup-core-boot \
	packagegroup-base-alsa \
	kernel-modules \
	kmod \
	packagegroup-qt5-slim \
	dosfstools \
	e2fsprogs \
	strace \
	ltrace \
	ldd \
	mtd-utils \
	gdbserver \
	iproute2 \
	canutils \
	i2c-tools \
	evtest \
	alsa-utils \
	openssh \
	openssh-sftp \
	openssh-sftp-server \
	e2fsprogs-mke2fs \
	e2fsprogs-tune2fs \
	parted \
	libicui18n \
	qt5everywheredemo \
	fbida \
	psplash \
"

inherit core-image

IMAGE_FSTYPES += "tar.gz"

