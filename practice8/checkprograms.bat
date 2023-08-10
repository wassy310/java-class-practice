@echo off
setlocal enabledelayedexpansion
for /f %%A in (programs.txt
	)do (
	echo -------------------------
	cd %CD%\%%A
	cmd /c %%A.bat
	echo -------------------------
	)
exit /b
