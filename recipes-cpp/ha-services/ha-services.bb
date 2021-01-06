DESCRIPTION = "Home Automation Services in C++"

LICENSE = "MIT"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

DEPENDS = "mosquitto"

SRC_URI = "\
	git://github.com/pawelwojtowicz/ha-services.git;protocol=https \
	"

# Modify these as desired
PV = "0.0.1+git${SRCPV}"
SRCREV = "6b892d71794d3273df2fe38a3a937e9d428c0484"

S = "${WORKDIR}/git"

inherit cmake


