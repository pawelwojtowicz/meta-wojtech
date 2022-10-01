
#activate the sound from the jack output (of te RPI2)
do_deploy:append() {
  CONFIG=${DEPLOYDIR}/${BOOTFILES_DIR_NAME}/config.txt
  sed -i '/#dtparam=audio=off/ c\dtparam=audio=on' $CONFIG
}