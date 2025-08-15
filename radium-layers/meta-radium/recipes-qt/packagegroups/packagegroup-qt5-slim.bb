DESCRIPTION = "Task to add Qt embedded related packages"
LICENSE = "MIT"
PR = "r14"

PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit packagegroup

TOUCH = ' ${@bb.utils.contains("MACHINE_FEATURES", "touchscreen", "tslib tslib-calibrate tslib-tests", "",d)}'

QT5_ESSENTIALS = "\
    qtbase \
    liberation-fonts \
    qtbase-plugins \
    qtlocation-plugins \
    qtlocation-qmlplugins \
    ${@bb.utils.contains('DISTRO_FEATURES', 'wayland', 'qtwayland-plugins', '', d)} \
    qt3d-qmlplugins \
    qtquickcontrols-qmlplugins \
    qtquickcontrols2-qmlplugins \
    qtgraphicaleffects-qmlplugins \
    qtvirtualkeyboard-plugins \
    qtvirtualkeyboard-qmlplugins \
    qtwebengine-qmlplugins \
    qtconnectivity \
    qtconnectivity-qmlplugins \
    qtdeclarative \
    qtdeclarative-qmlplugins \
    qtdeclarative-tools \
    qtmultimedia \
    qtmultimedia-plugins \
    qtmultimedia-qmlplugins \
    qtwebkit \
    qtsvg \
    ${TOUCH} \
"

QT5_ESSENTIALS:append_sbc-sama5d36 = "\
    qtwebkit-qmlplugins \
"

RDEPENDS_${PN} = "\
    ${@oe.utils.conditional('QT_PROVIDER', 'qt5', "${QT5_ESSENTIALS}", "", d)} \
"
