Se precisa
	1) Tener instalado y levantado el servidor de MySQL (https://dev.mysql.com/downloads/installer/)
	2) Tener instalada la aplicación de prueba Sakila de MySQL (https://dev.mysql.com/doc/index-other.html)
	3) Configurar el acceso a la base de datos desde resources/db.properties

Para regenerar JAVADOC en HTML, ejecutar desde la raíz del proyecto:
	WINDOWS: javadoc.exe -d .\javadoc\html\ -sourcepath .\src -subpackages training -charset "UTF-8" -encoding "UTF-8" -private
	LINUX: javadoc -d ./javadoc/html/ -sourcepath ./src -subpackages training -charset "UTF-8" -encoding "UTF-8" -private
