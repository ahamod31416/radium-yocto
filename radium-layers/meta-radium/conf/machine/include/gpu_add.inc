# =========================================================================
# gpu
# =========================================================================
# To support gpu on a machine,
# please add "gpu" to MACHINE_FEATURES in machine conf file
GPU_LIST ?= "\
    gcnano-driver-stm32mp \
    ${GPU_USERLAND_LIBRARIES_INSTALL} \
    "
GPU_IMAGE_INSTALL = "${@bb.utils.contains('MACHINE_FEATURES', 'gpu', '${GPU_LIST}', '', d)} "

