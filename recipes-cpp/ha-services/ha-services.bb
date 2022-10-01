DESCRIPTION = "Home Automation Services in C++"

LICENSE = "MIT"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

DEPENDS = "mosquitto"

SRC_URI = "\
	git://github.com/pawelwojtowicz/ha-services.git;protocol=https;branch=master \
	"

# Modify these as desired
PV = "0.0.1+git${SRCPV}"
SRCREV = "7c568fa448235e5e64fcdb71d779cc299afac4c0"

S = "${WORKDIR}/git"

inherit cmake


