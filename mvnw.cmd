@REM ----------------------------------------------------------------------------
@REM Apache Maven Wrapper startup batch script, version 3.3.2 (only-script mode)
@REM
@REM Downloads Apache Maven on first run, then delegates to it. Requires only a
@REM JDK to be installed and JAVA_HOME (or java on PATH) to be available.
@REM ----------------------------------------------------------------------------
@echo off
setlocal enabledelayedexpansion

set "MAVEN_VERSION=3.9.9"
set "DIST_URL=https://repo.maven.apache.org/maven2/org/apache/maven/apache-maven/%MAVEN_VERSION%/apache-maven-%MAVEN_VERSION%-bin.zip"
set "WRAPPER_DIR=%USERPROFILE%\.m2\wrapper\dists\apache-maven-%MAVEN_VERSION%"
set "MVN_CMD=%WRAPPER_DIR%\apache-maven-%MAVEN_VERSION%\bin\mvn.cmd"

if not exist "%MVN_CMD%" (
  echo Downloading Apache Maven %MAVEN_VERSION% ...
  if not exist "%WRAPPER_DIR%" mkdir "%WRAPPER_DIR%"
  set "ZIP=%WRAPPER_DIR%\maven.zip"
  powershell -NoProfile -Command "[Net.ServicePointManager]::SecurityProtocol=[Net.SecurityProtocolType]::Tls12; Invoke-WebRequest -Uri '%DIST_URL%' -OutFile '!ZIP!'"
  if errorlevel 1 (
    echo Failed to download Maven. Check your internet connection.
    exit /b 1
  )
  powershell -NoProfile -Command "Expand-Archive -Path '!ZIP!' -DestinationPath '%WRAPPER_DIR%' -Force"
  del "!ZIP!"
)

call "%MVN_CMD%" %*
