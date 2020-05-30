# ui-vuejs-k8

### 1. Build an image and tag it

####1.1 Build:
docker build -t ui-vuejs-k8 .

####1.2 Tag:
docker tag <imageID> ebd622/ui-vuejs-k8:x.x.x

#### Or build and tag it:
docker build -t ebd622/ui-vuejs-k8:x.x.x .

### 2. Push the image to the Docker Hub:

#### 2.1 Login to the Docker Hub
winpty docker login --username=ebd622

#### 2.2 Login to the Docker Hub
docker push ebd622/ui-vuejs-k8:x.x.x