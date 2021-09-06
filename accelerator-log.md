# Accelerator Log

## Options
```json
{
  "includeKubernetes" : false,
  "projectName" : "spring-petclinic-aks"
}
```
## Log
```
┏ engine (Chain)
┃  Info Running Chain(Combo, UniquePath)
┃ ┏ engine.transformations[0] (Combo)
┃ ┃  Info Combo running as Chain(Merge(merge), UniquePath(UseLast))
┃ ┃ engine.transformations[0].merge (Chain)
┃ ┃  Info Running Chain(Merge, UniquePath)
┃ ┃ ┏ engine.transformations[0].merge.transformations[0] (Merge)
┃ ┃ ┃  Info Running Merge(Combo, Combo, Combo)
┃ ┃ ┃ ┏ engine.transformations[0].merge.transformations[0].sources[0] (Combo)
┃ ┃ ┃ ┃  Info Combo running as Chain(Include, Exclude)
┃ ┃ ┃ ┃ engine.transformations[0].merge.transformations[0].sources[0].<combo> (Chain)
┃ ┃ ┃ ┃  Info Running Chain(Include, Exclude)
┃ ┃ ┃ ┃ ┏ engine.transformations[0].merge.transformations[0].sources[0].<combo>.transformations[0] (Include)
┃ ┃ ┃ ┃ ┃  Info Will include [**/*]
┃ ┃ ┃ ┃ ┃ Debug .editorconfig matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/MavenWrapperDownloader.java matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/maven-wrapper.jar matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/maven-wrapper.properties matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ Debug .travis.yml matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ Debug config/workload.yaml matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ Debug docker-compose.yml matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ Debug kubernetes/deployment-alv.yaml matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ Debug kubernetes/deployment.yaml matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ Debug kubernetes/service.yaml matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ Debug mvnw matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ Debug mvnw.cmd matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ Debug pom.xml matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ Debug readme.md matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ Debug skaffold.yaml matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ Debug src/checkstyle/nohttp-checkstyle-suppressions.xml matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ Debug src/checkstyle/nohttp-checkstyle.xml matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/springframework/samples/petclinic/PetClinicApplication.java matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/springframework/samples/petclinic/model/BaseEntity.java matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/springframework/samples/petclinic/model/NamedEntity.java matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/springframework/samples/petclinic/model/Person.java matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/springframework/samples/petclinic/model/package-info.java matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/springframework/samples/petclinic/owner/Owner.java matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/springframework/samples/petclinic/owner/OwnerController.java matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/springframework/samples/petclinic/owner/OwnerRepository.java matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/springframework/samples/petclinic/owner/Pet.java matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/springframework/samples/petclinic/owner/PetController.java matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/springframework/samples/petclinic/owner/PetRepository.java matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/springframework/samples/petclinic/owner/PetType.java matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/springframework/samples/petclinic/owner/PetTypeFormatter.java matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/springframework/samples/petclinic/owner/PetValidator.java matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/springframework/samples/petclinic/owner/VisitController.java matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/springframework/samples/petclinic/system/CacheConfiguration.java matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/springframework/samples/petclinic/system/CrashController.java matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/springframework/samples/petclinic/system/WelcomeController.java matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/springframework/samples/petclinic/vet/Specialty.java matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/springframework/samples/petclinic/vet/Vet.java matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/springframework/samples/petclinic/vet/VetController.java matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/springframework/samples/petclinic/vet/VetRepository.java matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/springframework/samples/petclinic/vet/Vets.java matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/springframework/samples/petclinic/visit/Visit.java matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/springframework/samples/petclinic/visit/VisitRepository.java matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/less/header.less matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/less/petclinic.less matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/less/responsive.less matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/less/typography.less matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/resources/application-mysql.properties matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/resources/application.properties matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/resources/banner.txt matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/resources/db/h2/data.sql matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/resources/db/h2/schema.sql matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/resources/db/hsqldb/data.sql matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/resources/db/hsqldb/schema.sql matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/resources/db/mysql/data.sql matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/resources/db/mysql/petclinic_db_setup_mysql.txt matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/resources/db/mysql/schema.sql matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/resources/db/mysql/user.sql matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/resources/messages/messages.properties matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/resources/messages/messages_de.properties matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/resources/messages/messages_en.properties matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/resources/messages/messages_es.properties matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/resources/static/resources/fonts/montserrat-webfont.eot matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/resources/static/resources/fonts/montserrat-webfont.svg matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/resources/static/resources/fonts/montserrat-webfont.ttf matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/resources/static/resources/fonts/montserrat-webfont.woff matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/resources/static/resources/fonts/varela_round-webfont.eot matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/resources/static/resources/fonts/varela_round-webfont.svg matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/resources/static/resources/fonts/varela_round-webfont.ttf matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/resources/static/resources/fonts/varela_round-webfont.woff matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/resources/static/resources/images/favicon.png matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/resources/static/resources/images/pets.png matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/resources/static/resources/images/platform-bg.png matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/resources/static/resources/images/spring-logo-dataflow-mobile.png matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/resources/static/resources/images/spring-logo-dataflow.png matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/resources/static/resources/images/spring-pivotal-logo.png matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/resources/templates/error.html matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/resources/templates/fragments/inputField.html matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/resources/templates/fragments/layout.html matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/resources/templates/fragments/selectField.html matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/resources/templates/owners/createOrUpdateOwnerForm.html matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/resources/templates/owners/findOwners.html matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/resources/templates/owners/ownerDetails.html matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/resources/templates/owners/ownersList.html matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/resources/templates/pets/createOrUpdatePetForm.html matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/resources/templates/pets/createOrUpdateVisitForm.html matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/resources/templates/vets/vetList.html matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/resources/templates/welcome.html matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/wro/wro.properties matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/wro/wro.xml matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ Debug src/test/java/org/springframework/samples/petclinic/PetclinicIntegrationTests.java matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ Debug src/test/java/org/springframework/samples/petclinic/model/ValidatorTests.java matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ Debug src/test/java/org/springframework/samples/petclinic/owner/OwnerControllerTests.java matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ Debug src/test/java/org/springframework/samples/petclinic/owner/PetControllerTests.java matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ Debug src/test/java/org/springframework/samples/petclinic/owner/PetTypeFormatterTests.java matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ Debug src/test/java/org/springframework/samples/petclinic/owner/VisitControllerTests.java matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ Debug src/test/java/org/springframework/samples/petclinic/service/ClinicServiceTests.java matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ Debug src/test/java/org/springframework/samples/petclinic/service/EntityUtils.java matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ Debug src/test/java/org/springframework/samples/petclinic/system/CrashControllerTests.java matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ Debug src/test/java/org/springframework/samples/petclinic/vet/VetControllerTests.java matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ Debug src/test/java/org/springframework/samples/petclinic/vet/VetTests.java matched [**/*] -> included
┃ ┃ ┃ ┃ ┗ Debug src/test/jmeter/petclinic_test_plan.jmx matched [**/*] -> included
┃ ┃ ┃ ┃ ┏ engine.transformations[0].merge.transformations[0].sources[0].<combo>.transformations[1] (Exclude)
┃ ┃ ┃ ┃ ┃  Info Will exclude [kubernetes/*.yaml, skaffold.yaml]
┃ ┃ ┃ ┃ ┃ Debug .editorconfig didn't match [kubernetes/*.yaml, skaffold.yaml] -> included
┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/MavenWrapperDownloader.java didn't match [kubernetes/*.yaml, skaffold.yaml] -> included
┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/maven-wrapper.jar didn't match [kubernetes/*.yaml, skaffold.yaml] -> included
┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/maven-wrapper.properties didn't match [kubernetes/*.yaml, skaffold.yaml] -> included
┃ ┃ ┃ ┃ ┃ Debug .travis.yml didn't match [kubernetes/*.yaml, skaffold.yaml] -> included
┃ ┃ ┃ ┃ ┃ Debug config/workload.yaml didn't match [kubernetes/*.yaml, skaffold.yaml] -> included
┃ ┃ ┃ ┃ ┃ Debug docker-compose.yml didn't match [kubernetes/*.yaml, skaffold.yaml] -> included
┃ ┃ ┃ ┃ ┃ Debug kubernetes/deployment-alv.yaml matched [kubernetes/*.yaml, skaffold.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ Debug kubernetes/deployment.yaml matched [kubernetes/*.yaml, skaffold.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ Debug kubernetes/service.yaml matched [kubernetes/*.yaml, skaffold.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ Debug mvnw didn't match [kubernetes/*.yaml, skaffold.yaml] -> included
┃ ┃ ┃ ┃ ┃ Debug mvnw.cmd didn't match [kubernetes/*.yaml, skaffold.yaml] -> included
┃ ┃ ┃ ┃ ┃ Debug pom.xml didn't match [kubernetes/*.yaml, skaffold.yaml] -> included
┃ ┃ ┃ ┃ ┃ Debug readme.md didn't match [kubernetes/*.yaml, skaffold.yaml] -> included
┃ ┃ ┃ ┃ ┃ Debug skaffold.yaml matched [kubernetes/*.yaml, skaffold.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ Debug src/checkstyle/nohttp-checkstyle-suppressions.xml didn't match [kubernetes/*.yaml, skaffold.yaml] -> included
┃ ┃ ┃ ┃ ┃ Debug src/checkstyle/nohttp-checkstyle.xml didn't match [kubernetes/*.yaml, skaffold.yaml] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/springframework/samples/petclinic/PetClinicApplication.java didn't match [kubernetes/*.yaml, skaffold.yaml] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/springframework/samples/petclinic/model/BaseEntity.java didn't match [kubernetes/*.yaml, skaffold.yaml] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/springframework/samples/petclinic/model/NamedEntity.java didn't match [kubernetes/*.yaml, skaffold.yaml] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/springframework/samples/petclinic/model/Person.java didn't match [kubernetes/*.yaml, skaffold.yaml] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/springframework/samples/petclinic/model/package-info.java didn't match [kubernetes/*.yaml, skaffold.yaml] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/springframework/samples/petclinic/owner/Owner.java didn't match [kubernetes/*.yaml, skaffold.yaml] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/springframework/samples/petclinic/owner/OwnerController.java didn't match [kubernetes/*.yaml, skaffold.yaml] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/springframework/samples/petclinic/owner/OwnerRepository.java didn't match [kubernetes/*.yaml, skaffold.yaml] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/springframework/samples/petclinic/owner/Pet.java didn't match [kubernetes/*.yaml, skaffold.yaml] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/springframework/samples/petclinic/owner/PetController.java didn't match [kubernetes/*.yaml, skaffold.yaml] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/springframework/samples/petclinic/owner/PetRepository.java didn't match [kubernetes/*.yaml, skaffold.yaml] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/springframework/samples/petclinic/owner/PetType.java didn't match [kubernetes/*.yaml, skaffold.yaml] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/springframework/samples/petclinic/owner/PetTypeFormatter.java didn't match [kubernetes/*.yaml, skaffold.yaml] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/springframework/samples/petclinic/owner/PetValidator.java didn't match [kubernetes/*.yaml, skaffold.yaml] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/springframework/samples/petclinic/owner/VisitController.java didn't match [kubernetes/*.yaml, skaffold.yaml] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/springframework/samples/petclinic/system/CacheConfiguration.java didn't match [kubernetes/*.yaml, skaffold.yaml] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/springframework/samples/petclinic/system/CrashController.java didn't match [kubernetes/*.yaml, skaffold.yaml] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/springframework/samples/petclinic/system/WelcomeController.java didn't match [kubernetes/*.yaml, skaffold.yaml] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/springframework/samples/petclinic/vet/Specialty.java didn't match [kubernetes/*.yaml, skaffold.yaml] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/springframework/samples/petclinic/vet/Vet.java didn't match [kubernetes/*.yaml, skaffold.yaml] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/springframework/samples/petclinic/vet/VetController.java didn't match [kubernetes/*.yaml, skaffold.yaml] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/springframework/samples/petclinic/vet/VetRepository.java didn't match [kubernetes/*.yaml, skaffold.yaml] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/springframework/samples/petclinic/vet/Vets.java didn't match [kubernetes/*.yaml, skaffold.yaml] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/springframework/samples/petclinic/visit/Visit.java didn't match [kubernetes/*.yaml, skaffold.yaml] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/springframework/samples/petclinic/visit/VisitRepository.java didn't match [kubernetes/*.yaml, skaffold.yaml] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/less/header.less didn't match [kubernetes/*.yaml, skaffold.yaml] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/less/petclinic.less didn't match [kubernetes/*.yaml, skaffold.yaml] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/less/responsive.less didn't match [kubernetes/*.yaml, skaffold.yaml] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/less/typography.less didn't match [kubernetes/*.yaml, skaffold.yaml] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/resources/application-mysql.properties didn't match [kubernetes/*.yaml, skaffold.yaml] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/resources/application.properties didn't match [kubernetes/*.yaml, skaffold.yaml] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/resources/banner.txt didn't match [kubernetes/*.yaml, skaffold.yaml] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/resources/db/h2/data.sql didn't match [kubernetes/*.yaml, skaffold.yaml] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/resources/db/h2/schema.sql didn't match [kubernetes/*.yaml, skaffold.yaml] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/resources/db/hsqldb/data.sql didn't match [kubernetes/*.yaml, skaffold.yaml] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/resources/db/hsqldb/schema.sql didn't match [kubernetes/*.yaml, skaffold.yaml] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/resources/db/mysql/data.sql didn't match [kubernetes/*.yaml, skaffold.yaml] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/resources/db/mysql/petclinic_db_setup_mysql.txt didn't match [kubernetes/*.yaml, skaffold.yaml] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/resources/db/mysql/schema.sql didn't match [kubernetes/*.yaml, skaffold.yaml] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/resources/db/mysql/user.sql didn't match [kubernetes/*.yaml, skaffold.yaml] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/resources/messages/messages.properties didn't match [kubernetes/*.yaml, skaffold.yaml] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/resources/messages/messages_de.properties didn't match [kubernetes/*.yaml, skaffold.yaml] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/resources/messages/messages_en.properties didn't match [kubernetes/*.yaml, skaffold.yaml] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/resources/messages/messages_es.properties didn't match [kubernetes/*.yaml, skaffold.yaml] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/resources/static/resources/fonts/montserrat-webfont.eot didn't match [kubernetes/*.yaml, skaffold.yaml] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/resources/static/resources/fonts/montserrat-webfont.svg didn't match [kubernetes/*.yaml, skaffold.yaml] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/resources/static/resources/fonts/montserrat-webfont.ttf didn't match [kubernetes/*.yaml, skaffold.yaml] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/resources/static/resources/fonts/montserrat-webfont.woff didn't match [kubernetes/*.yaml, skaffold.yaml] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/resources/static/resources/fonts/varela_round-webfont.eot didn't match [kubernetes/*.yaml, skaffold.yaml] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/resources/static/resources/fonts/varela_round-webfont.svg didn't match [kubernetes/*.yaml, skaffold.yaml] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/resources/static/resources/fonts/varela_round-webfont.ttf didn't match [kubernetes/*.yaml, skaffold.yaml] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/resources/static/resources/fonts/varela_round-webfont.woff didn't match [kubernetes/*.yaml, skaffold.yaml] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/resources/static/resources/images/favicon.png didn't match [kubernetes/*.yaml, skaffold.yaml] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/resources/static/resources/images/pets.png didn't match [kubernetes/*.yaml, skaffold.yaml] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/resources/static/resources/images/platform-bg.png didn't match [kubernetes/*.yaml, skaffold.yaml] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/resources/static/resources/images/spring-logo-dataflow-mobile.png didn't match [kubernetes/*.yaml, skaffold.yaml] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/resources/static/resources/images/spring-logo-dataflow.png didn't match [kubernetes/*.yaml, skaffold.yaml] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/resources/static/resources/images/spring-pivotal-logo.png didn't match [kubernetes/*.yaml, skaffold.yaml] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/resources/templates/error.html didn't match [kubernetes/*.yaml, skaffold.yaml] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/resources/templates/fragments/inputField.html didn't match [kubernetes/*.yaml, skaffold.yaml] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/resources/templates/fragments/layout.html didn't match [kubernetes/*.yaml, skaffold.yaml] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/resources/templates/fragments/selectField.html didn't match [kubernetes/*.yaml, skaffold.yaml] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/resources/templates/owners/createOrUpdateOwnerForm.html didn't match [kubernetes/*.yaml, skaffold.yaml] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/resources/templates/owners/findOwners.html didn't match [kubernetes/*.yaml, skaffold.yaml] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/resources/templates/owners/ownerDetails.html didn't match [kubernetes/*.yaml, skaffold.yaml] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/resources/templates/owners/ownersList.html didn't match [kubernetes/*.yaml, skaffold.yaml] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/resources/templates/pets/createOrUpdatePetForm.html didn't match [kubernetes/*.yaml, skaffold.yaml] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/resources/templates/pets/createOrUpdateVisitForm.html didn't match [kubernetes/*.yaml, skaffold.yaml] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/resources/templates/vets/vetList.html didn't match [kubernetes/*.yaml, skaffold.yaml] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/resources/templates/welcome.html didn't match [kubernetes/*.yaml, skaffold.yaml] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/wro/wro.properties didn't match [kubernetes/*.yaml, skaffold.yaml] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/wro/wro.xml didn't match [kubernetes/*.yaml, skaffold.yaml] -> included
┃ ┃ ┃ ┃ ┃ Debug src/test/java/org/springframework/samples/petclinic/PetclinicIntegrationTests.java didn't match [kubernetes/*.yaml, skaffold.yaml] -> included
┃ ┃ ┃ ┃ ┃ Debug src/test/java/org/springframework/samples/petclinic/model/ValidatorTests.java didn't match [kubernetes/*.yaml, skaffold.yaml] -> included
┃ ┃ ┃ ┃ ┃ Debug src/test/java/org/springframework/samples/petclinic/owner/OwnerControllerTests.java didn't match [kubernetes/*.yaml, skaffold.yaml] -> included
┃ ┃ ┃ ┃ ┃ Debug src/test/java/org/springframework/samples/petclinic/owner/PetControllerTests.java didn't match [kubernetes/*.yaml, skaffold.yaml] -> included
┃ ┃ ┃ ┃ ┃ Debug src/test/java/org/springframework/samples/petclinic/owner/PetTypeFormatterTests.java didn't match [kubernetes/*.yaml, skaffold.yaml] -> included
┃ ┃ ┃ ┃ ┃ Debug src/test/java/org/springframework/samples/petclinic/owner/VisitControllerTests.java didn't match [kubernetes/*.yaml, skaffold.yaml] -> included
┃ ┃ ┃ ┃ ┃ Debug src/test/java/org/springframework/samples/petclinic/service/ClinicServiceTests.java didn't match [kubernetes/*.yaml, skaffold.yaml] -> included
┃ ┃ ┃ ┃ ┃ Debug src/test/java/org/springframework/samples/petclinic/service/EntityUtils.java didn't match [kubernetes/*.yaml, skaffold.yaml] -> included
┃ ┃ ┃ ┃ ┃ Debug src/test/java/org/springframework/samples/petclinic/system/CrashControllerTests.java didn't match [kubernetes/*.yaml, skaffold.yaml] -> included
┃ ┃ ┃ ┃ ┃ Debug src/test/java/org/springframework/samples/petclinic/vet/VetControllerTests.java didn't match [kubernetes/*.yaml, skaffold.yaml] -> included
┃ ┃ ┃ ┃ ┃ Debug src/test/java/org/springframework/samples/petclinic/vet/VetTests.java didn't match [kubernetes/*.yaml, skaffold.yaml] -> included
┃ ┃ ┃ ┗ ┗ Debug src/test/jmeter/petclinic_test_plan.jmx didn't match [kubernetes/*.yaml, skaffold.yaml] -> included
┃ ┃ ┃ ┏ engine.transformations[0].merge.transformations[0].sources[1] (Combo)
┃ ┃ ┃ ┃  Info Condition (#includeKubernetes) evaluated to false
┃ ┃ ┃ ┗ null ()
┃ ┃ ┃ ┏ engine.transformations[0].merge.transformations[0].sources[2] (Combo)
┃ ┃ ┃ ┃  Info Condition (#includeKubernetes and #enableAppLiveView) evaluated to false
┃ ┃ ┗ ┗ null ()
┃ ┗ ╺ engine.transformations[0].merge.transformations[1] (UniquePath)
┗ ╺ engine.transformations[1] (UniquePath)
```
