FROM registry.cn-hangzhou.aliyuncs.com/myimage/jdk8
VOLUME /tmp
ADD  /var/lib/jenkins/workspace/compute/target/config-client-eureka-1.0.0.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]