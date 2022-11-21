# 

## Model
www.msaez.io/#/storming/Jxr4OOAGRAbozsXxjH2xiURXUDg2/c11e3aaa63e98efc98f1135c4b92b580

## Before Running Services
### Make sure there is a Kafka server running
```
cd kafka
docker-compose up
```
- Check the Kafka messages:
```
cd kafka
docker-compose exec -it kafka /bin/bash
cd /bin
./kafka-console-consumer --bootstrap-server localhost:9092 --topic
```

## Run the backend micro-services
See the README.md files inside the each microservices directory:

- front
- store
- delivery
- customer
- marketing


## Run API Gateway (Spring Gateway)
```
cd gateway
mvn spring-boot:run
```

## Test by API
- front
```
 http :8088/orders id="id" foodId="foodId" customerId="customerId" preference="preference" options="options" address="address" status="status" 
 http :8088/payments id="id" orderId="orderId" 
```
- store
```
 http :8088/storeOrders id="id" foodId="foodId" preference="preference" orderId="orderId" status="status" test="test" 
 http :8088/menus id="id" 
```
- delivery
```
 http :8088/deliveries id="id" address="address" orderId="orderId" 
```
- customer
```
 http :8088/notificationLogs id="id" customerId="customerId" message="message" 
```
- marketing
```
 http :8088/preferences id="id" foodId="foodId" count="count" 
```


## Run the frontend
```
cd frontend
npm i
npm run serve
```

## Test by UI
Open a browser to localhost:8088

## Required Utilities

- httpie (alternative for curl / POSTMAN) and network utils
```
sudo apt-get update
sudo apt-get install net-tools
sudo apt install iputils-ping
pip install httpie
```

- kubernetes utilities (kubectl)
```
curl -LO "https://dl.k8s.io/release/$(curl -L -s https://dl.k8s.io/release/stable.txt)/bin/linux/amd64/kubectl"
sudo install -o root -g root -m 0755 kubectl /usr/local/bin/kubectl
```

- aws cli (aws)
```
curl "https://awscli.amazonaws.com/awscli-exe-linux-x86_64.zip" -o "awscliv2.zip"
unzip awscliv2.zip
sudo ./aws/install
```

- eksctl 
```
curl --silent --location "https://github.com/weaveworks/eksctl/releases/latest/download/eksctl_$(uname -s)_amd64.tar.gz" | tar xz -C /tmp
sudo mv /tmp/eksctl /usr/local/bin
```

