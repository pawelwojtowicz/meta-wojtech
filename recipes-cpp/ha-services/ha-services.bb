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
SRCREV = "a279303f0606289aa968e0507c72450c88c68e04"

S = "${WORKDIR}/git"

FILES:${PN}= "/lib/systemd/system/* \ 
              /usr/lib/* \
              /usr/bin/* \
              "

SYSTEMD_SERVICE_${PN} = " \
    speaking-agent.service \
    "

inherit cmake systemd

do_install:append() {
  install -Dm 0644 ${THISDIR}/${BPN}/speaking-agent.service ${D}${systemd_unitdir}/system/speaking-agent.service
}



