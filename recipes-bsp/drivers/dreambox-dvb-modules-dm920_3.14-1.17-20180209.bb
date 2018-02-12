KV = "3.14-1.17"
DRIVERDATE = "20180209"

require dreambox-dvb-modules-new.inc

PR = "${INC_PR}.0"

SRC_URI[dm920.md5sum] = "6f8421d264044f1d23a560be81c21114"
SRC_URI[dm920.sha256sum] = "7a90c9fd752e652329527aa1132417a964c590bf032d531955607b2992b33d38"

COMPATIBLE_MACHINE = "dm920"

MD5SUM = "${@d.getVarFlag('SRC_URI', 'dm920.md5sum', True)}"
