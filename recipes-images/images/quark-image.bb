IMAGE_FEATURES += "x11-base qt4-pkgs splash ssh-server-openssh tools-sdk \
                   tools-debug debug-tweaks dev-pkgs \
                   "
EXTRA_IMAGE_FEATURES += "package-management"

CORE_IMAGE_EXTRA_INSTALL += "\
    packagegroup-sdr-base-extended \
    packagegroup-sdr-base-debug \
    packagegroup-sdr-base-devel \
    packagegroup-sdr-base-python \
    vlc \
    libv4l \
    xinput-calibrator \
    xserver-xorg-extension-glx \
    directfb-examples \
    xauth \
    yavta \
    kernel-dev \
    "

inherit core-image
