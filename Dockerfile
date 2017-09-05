FROM registry.cn-hangzhou.aliyuncs.com/myimage/jdk8
VOLUME /tmp
ADD  config-client-eureka-1.0.0.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]