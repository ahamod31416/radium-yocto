# replace securetty with our own. we allow root access via telnet

# search our filepath before the filepath of the source recipe
FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

