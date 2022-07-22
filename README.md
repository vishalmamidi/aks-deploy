# Getting Started

## Helm commands

### install / upgrade release

  ```shell
  helm upgrade --install aks-deploy helm-aks-deploy/ --set image.tag=latest --namespace demo-namespace --create-namespace --wait
  ```

  ### uninstall release

  ```shell
  helm uninstall aks-deploy --namespace demo-namespace
  ```

  ### check past history of releases

  ```shell
  helm history aks-deploy --namespace demo-namespace
  ```

  ```shell
  helm list --all-namespaces
  ```

  ### rollback to old releases

  ```shell
  helm rollback aks-deploy --namespace demo-namespace
  ```


  ### verify deployment

  ```shell
  kubectl rollout status deployment/demo -n demo-namespace
  ```



## build jar

  ```shell
  ./gradlew build
  ```

## build and tag

  ```shell
  sudo docker build -t ghcr.io/vishalmamidi/demo --build-arg DESCRIPTION=vishal .
  ```

  ```shell
  sudo docker inspect ghcr.io/vishalmamidi/demo
  ```

## push tagged container image

  ```shell
  sudo docker push ghcr.io/vishalmamidi/demo
  ```

## run container image

  ```shell
  sudo docker run -p 8080:8080 vishalmamidi/demo
  ```

## check and stop container


  ```shell
  sudo docker stop $(sudo docker ps -q --filter ancestor=vishalmamidi/demo-rest )
  ```

or if you know container id

  ```shell
  sudo docker stop <container-id>
  ```
## if using self - hosted runners do this <https://docs.docker.com/engine/install/linux-postinstall/>
