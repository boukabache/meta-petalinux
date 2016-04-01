SUMMARY = "Libmetal : Libmetal implements an abstraction layer across user-space Linux, baremetal, and RTOS environments"

HOMEPAGE = "https://github.com/OpenAMP/libmetal/"

SECTION = "libs"

LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=395307789d21fd8945fc1c933cad18b5"

SRCREV ?= "${AUTOREV}"
SRC_URI = "git://github.com/OpenAMP/libmetal.git;protocol=https;branch=master"

S = "${WORKDIR}/git"
DEPENDS = "libhugetlbfs sysfsutils"
inherit pkgconfig cmake

EXTRA_OECMAKE = "-DLIB_INSTALL_DIR=${libdir} -DLIBEXEC_INSTALL_DIR=${libexecdir} -DMACHINE=${SOC_FAMILY}"
