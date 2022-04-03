pwd
PROJECT_DIR=$(pwd)
cd $PROJECT_DIR/discovery
pwd
mvn spring-boot:run
cd $PROJECT_DIR/album
pwd
mvn spring-boot:run
cd $PROJECT_DIR/micro
pwd
mvn spring-boot:run
cd $PROJECT_DIR/dotnet
pwd
dotnet run
cd $PROJECT_DIR/api-gateway
pwd
mvn spring-boot:run