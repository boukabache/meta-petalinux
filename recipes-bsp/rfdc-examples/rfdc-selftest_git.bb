SUMMARY = "Simple rfdc-selftest application"

require rfdc-examples.inc

do_compile (){
    make all OUTS=rfdc-selftest RFDC_OBJS=xrfdc_selftest_example.o
}

do_install() {
    install -d ${D}${bindir}
    install -m 0755 ${S}/rfdc-selftest ${D}${bindir}
}
