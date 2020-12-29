SUMMARY = "The webfeed for the HA system"
HOMEPAGE = "https://github.com/pawelwojtowicz/ha-webfeed#readme"

LICENSE = ""
LIC_FILES_CHKSUM = "file://package.json;md5=dd3defdc3f13b2f084eb1d3f18eb09b1"

SRC_URI = " \
    git://github.com/pawelwojtowicz/ha-webfeed.git;protocol=https \
    file://ha-webfeed.service \
    "

PV = "0.0.1+git${SRCPV}"
SRCREV = "702d0c3d33c0e37756edb203f3b8d563cb42a44a"

inherit npm systemd

SYSTEMD_SERVICE_${PN}="ha-webfeed.service"
