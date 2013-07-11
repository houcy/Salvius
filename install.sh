printf "Moving files into current directory...\r"

sudo mv -f * ./Salvius/[A-Za-z0-9]* ../

printf "Removing empty download directory"

sudo rm -r Salvius

printf "Updating package cache...\r"

sudo apt-get update


