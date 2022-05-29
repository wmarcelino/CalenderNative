import React from 'react';
import {
  Button,
  SafeAreaView,
  ScrollView,
  StatusBar,
  useColorScheme,
} from 'react-native';

import {Colors} from 'react-native/Libraries/NewAppScreen';
import {NativeModules} from 'react-native';

const {CalendarModule} = NativeModules;

const App = () => {
  const isDarkMode = useColorScheme() === 'dark';

  const backgroundStyle = {
    backgroundColor: isDarkMode ? Colors.darker : Colors.lighter,
  };

  const handleNativeButtonPress = () => {
    console.log('handleNativeButtonPress --- begin');
    CalendarModule.createCalendarEvent('testName', 'testLocation');
  };
  return (
    <SafeAreaView style={backgroundStyle}>
      <StatusBar barStyle={isDarkMode ? 'light-content' : 'dark-content'} />
      <ScrollView
        contentInsetAdjustmentBehavior="automatic"
        style={backgroundStyle}
      />
      <Button title="Android Native Method" onPress={handleNativeButtonPress} />
    </SafeAreaView>
  );
};

export default App;
