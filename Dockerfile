FROM openjdk:1.8

RUN mkdir /MyCashbackApp

COPY bin/ /MyCashbackApp

CMD java com.cisco.app.MyApp

#ENTRYPOINT ["java" "com.cisco.app.MyApp"]