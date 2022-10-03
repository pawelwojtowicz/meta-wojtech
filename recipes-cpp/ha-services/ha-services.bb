DESCRIPTION = "Home Automation Services in C++"

LICENSE = "MIT"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

DEPENDS = "mosquitto flite"

SRC_URI = "\
	git://github.com/pawelwojtowicz/ha-services.git;protocol=https;branch=master \
  file://${THISDIR}/${BPN}/speaking-agent.service \
	"

# Modify these as desired
PV = "0.0.1+git${SRCPV}"
SRCREV = "2af6a1b2721810b949c7464fdfe6c9d016a982e1"

S = "${WORKDIR}/git"

FILES:${PN}= "/lib/systemd/system/* \ 
              /usr/lib/* \
              /usr/bin/* \
              "


inherit cmake systemd

do_install:append() {
  install -Dm 0644 ${THISDIR}/${BPN}/speaking-agent.service ${D}${systemd_unitdir}/system/speaking-agent.service
}



