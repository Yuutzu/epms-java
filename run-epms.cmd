@echo off
REM Double-click launcher for EPMS.
REM Builds the app the first time if the jar is missing, then runs it.

cd /d "%~dp0"

if not exist "target\EPMS.jar" (
  echo Building EPMS for the first time...
  call mvnw.cmd -q clean package
  if errorlevel 1 (
    echo Build failed. See messages above.
    pause
    exit /b 1
  )
)

java -jar "target\EPMS.jar"
