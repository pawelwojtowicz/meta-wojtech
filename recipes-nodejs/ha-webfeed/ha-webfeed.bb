SUMMARY = "The webfeed for the HA system"
HOMEPAGE = "https://github.com/pawelwojtowicz/ha-webfeed#readme"

LIC_FILES_CHKSUM = "file://package.json;md5=80080ef70cbb44594063806fc2088bcc"

LICENSE = "MIT"

SRC_URI = " \
    git://github.com/pawelwojtowicz/ha-webfeed.git;branch=master \
    npmsw://${THISDIR}/${BPN}/npm-shrinkwrap.json \
    file://${THISDIR}/${BPN}/ha-webfeed.service \
    "

SYSTEMD_SERVICE_${PN} = "ha-webfeed.service"

# Modify these as desired
PV = "0.0.1+git${SRCPV}"
SRCREV = "970d9275be323b2d4d3e648be5e525a1cf434de1"

S = "${WORKDIR}/git"

inherit npm systemd

do_install:append() {
  install -Dm 0644 ${THISDIR}/${BPN}/ha-webfeed.service ${D}${systemd_unitdir}/system/ha-webfeed.service
}
