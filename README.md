# radium-yocto
Repo for generating yocto image based on stm32mp157 mpu. 

After successfully clonning the git repo, please exexute the following scrpit in radium-yocto folder.

./setup_radium.sh

above commandd will clone necessary repo in the radium-layers folder. 

After that excute following command to establish bitbake environment.

source radium-layers/meta-radium/setup-environment build-radium

now execute following command create the image for radium bsp

bitbake radium-image
