SUMMARY = "Zigbee2MQTT gateway"
HOMEPAGE = "https://www.zigbee2mqtt.io/"

LIC_FILES_CHKSUM = "file://LICENSE;md5=84dcc94da3adb52b53ae4fa38fe49e5d"
                                       
LICENSE = "GPL-3.0-only"

RDEPENDS:${PN} += "bash"

SRC_URI = " \
    git://github.com/Koenkk/zigbee2mqtt.git;protocol=https;branch=master \
    file://${THISDIR}/${BPN}/zigbee2mqtt.service \
    "

FILES:${PN}= "/lib/systemd/system/* \
              /opt/zigbee2mqtt/* \
              "

# Modify these as desired
PV = "1.27.2+git${SRCPV}"
SRCREV = "7dc48fb6d657f2560b42b93bc47c569620b3582f"

S = "${WORKDIR}/git"

inherit systemd

do_install:append() {
  mkdir -p ${D}/opt/zigbee2mqtt
  cp --preserve=mode,timestamps -R ${S}/* ${D}/opt/zigbee2mqtt

  install -Dm 0644 ${THISDIR}/${BPN}/zigbee2mqtt.service ${D}${systemd_unitdir}/system/zigbee2mqtt.service
}
