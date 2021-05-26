cd..
python -m venv RobotFramework\venv
xcopy /i /e "RobotFrameworkTest" "RobotFramework" /y 
Del RobotFramework\*.bat
pip install -r RobotFramework\requirements.txt
