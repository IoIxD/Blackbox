package net.ioixd.blackbox.extendables;
import net.ioixd.blackbox.BlackBox;
import net.ioixd.blackbox.Native;

import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginBase;
public class ExtendablePluginBase extends PluginBase {
    public String name;
    public String inLibName;
    public BlackBox blackBox;

    ExtendablePluginBase(Plugin blackBox, String name, String inLibName) {
        this.blackBox = (BlackBox) blackBox;
        this.name = name;
        this.inLibName = inLibName;
        Misc.throwIfFuncsNotBound(this.inLibName, this.name, this.getClass());
    }


	public org.bukkit.Server getServer() {
       Object result = null;
       try {
           result = Native.execute(this.inLibName, "__extends__PluginBase__"+this.name+"__getServer", this.blackBox, new Object[] {});
       } catch(Exception ex) {
           ex.printStackTrace();
           this.blackBox.getLogger().severe("The fact that an error was thrown at this stage indicates a severe error. Assuming the plugin can no longer run safely, it is being shut off.");
           this.blackBox.disable();
       }
       return (org.bukkit.Server) result;
    }
	public org.bukkit.plugin.PluginDescriptionFile getDescription() {
       Object result = null;
       try {
           result = Native.execute(this.inLibName, "__extends__PluginBase__"+this.name+"__getDescription", this.blackBox, new Object[] {});
       } catch(Exception ex) {
           ex.printStackTrace();
           this.blackBox.getLogger().severe("The fact that an error was thrown at this stage indicates a severe error. Assuming the plugin can no longer run safely, it is being shut off.");
           this.blackBox.disable();
       }
       return (org.bukkit.plugin.PluginDescriptionFile) result;
    }
	public org.bukkit.generator.BiomeProvider getDefaultBiomeProvider(java.lang.String arg0, java.lang.String arg1) {
       Object result = null;
       try {
           result = Native.execute(this.inLibName, "__extends__PluginBase__"+this.name+"__getDefaultBiomeProvider", this.blackBox, new Object[] {
               arg0, arg1
           });
       } catch(Exception ex) {
           ex.printStackTrace();
           this.blackBox.getLogger().severe("The fact that an error was thrown at this stage indicates a severe error. Assuming the plugin can no longer run safely, it is being shut off.");
           this.blackBox.disable();
       }
       return (org.bukkit.generator.BiomeProvider) result;
    }
	public boolean isEnabled() {
       Object result = null;
       try {
           result = Native.execute(this.inLibName, "__extends__PluginBase__"+this.name+"__isEnabled", this.blackBox, new Object[] {});
       } catch(Exception ex) {
           ex.printStackTrace();
           this.blackBox.getLogger().severe("The fact that an error was thrown at this stage indicates a severe error. Assuming the plugin can no longer run safely, it is being shut off.");
           this.blackBox.disable();
       }
       return (boolean) result;
    }
	public org.bukkit.configuration.file.FileConfiguration getConfig() {
       Object result = null;
       try {
           result = Native.execute(this.inLibName, "__extends__PluginBase__"+this.name+"__getConfig", this.blackBox, new Object[] {});
       } catch(Exception ex) {
           ex.printStackTrace();
           this.blackBox.getLogger().severe("The fact that an error was thrown at this stage indicates a severe error. Assuming the plugin can no longer run safely, it is being shut off.");
           this.blackBox.disable();
       }
       return (org.bukkit.configuration.file.FileConfiguration) result;
    }
	public java.io.File getDataFolder() {
       Object result = null;
       try {
           result = Native.execute(this.inLibName, "__extends__PluginBase__"+this.name+"__getDataFolder", this.blackBox, new Object[] {});
       } catch(Exception ex) {
           ex.printStackTrace();
           this.blackBox.getLogger().severe("The fact that an error was thrown at this stage indicates a severe error. Assuming the plugin can no longer run safely, it is being shut off.");
           this.blackBox.disable();
       }
       return (java.io.File) result;
    }
	public void saveConfig() {
       Object result = null;
       try {
           result = Native.execute(this.inLibName, "__extends__PluginBase__"+this.name+"__saveConfig", this.blackBox, new Object[] {});
       } catch(Exception ex) {
           ex.printStackTrace();
           this.blackBox.getLogger().severe("The fact that an error was thrown at this stage indicates a severe error. Assuming the plugin can no longer run safely, it is being shut off.");
           this.blackBox.disable();
       }
    }
	public void saveDefaultConfig() {
       Object result = null;
       try {
           result = Native.execute(this.inLibName, "__extends__PluginBase__"+this.name+"__saveDefaultConfig", this.blackBox, new Object[] {});
       } catch(Exception ex) {
           ex.printStackTrace();
           this.blackBox.getLogger().severe("The fact that an error was thrown at this stage indicates a severe error. Assuming the plugin can no longer run safely, it is being shut off.");
           this.blackBox.disable();
       }
    }
	public void saveResource(java.lang.String arg0, boolean arg1) {
       Object result = null;
       try {
           result = Native.execute(this.inLibName, "__extends__PluginBase__"+this.name+"__saveResource", this.blackBox, new Object[] {
               arg0, arg1
           });
       } catch(Exception ex) {
           ex.printStackTrace();
           this.blackBox.getLogger().severe("The fact that an error was thrown at this stage indicates a severe error. Assuming the plugin can no longer run safely, it is being shut off.");
           this.blackBox.disable();
       }
    }
	public void reloadConfig() {
       Object result = null;
       try {
           result = Native.execute(this.inLibName, "__extends__PluginBase__"+this.name+"__reloadConfig", this.blackBox, new Object[] {});
       } catch(Exception ex) {
           ex.printStackTrace();
           this.blackBox.getLogger().severe("The fact that an error was thrown at this stage indicates a severe error. Assuming the plugin can no longer run safely, it is being shut off.");
           this.blackBox.disable();
       }
    }
	public org.bukkit.plugin.PluginLoader getPluginLoader() {
       Object result = null;
       try {
           result = Native.execute(this.inLibName, "__extends__PluginBase__"+this.name+"__getPluginLoader", this.blackBox, new Object[] {});
       } catch(Exception ex) {
           ex.printStackTrace();
           this.blackBox.getLogger().severe("The fact that an error was thrown at this stage indicates a severe error. Assuming the plugin can no longer run safely, it is being shut off.");
           this.blackBox.disable();
       }
       return (org.bukkit.plugin.PluginLoader) result;
    }
	public void onDisable() {
       Object result = null;
       try {
           result = Native.execute(this.inLibName, "__extends__PluginBase__"+this.name+"__onDisable", this.blackBox, new Object[] {});
       } catch(Exception ex) {
           ex.printStackTrace();
           this.blackBox.getLogger().severe("The fact that an error was thrown at this stage indicates a severe error. Assuming the plugin can no longer run safely, it is being shut off.");
           this.blackBox.disable();
       }
    }
	public void onLoad() {
       Object result = null;
       try {
           result = Native.execute(this.inLibName, "__extends__PluginBase__"+this.name+"__onLoad", this.blackBox, new Object[] {});
       } catch(Exception ex) {
           ex.printStackTrace();
           this.blackBox.getLogger().severe("The fact that an error was thrown at this stage indicates a severe error. Assuming the plugin can no longer run safely, it is being shut off.");
           this.blackBox.disable();
       }
    }
	public void onEnable() {
       Object result = null;
       try {
           result = Native.execute(this.inLibName, "__extends__PluginBase__"+this.name+"__onEnable", this.blackBox, new Object[] {});
       } catch(Exception ex) {
           ex.printStackTrace();
           this.blackBox.getLogger().severe("The fact that an error was thrown at this stage indicates a severe error. Assuming the plugin can no longer run safely, it is being shut off.");
           this.blackBox.disable();
       }
    }
	public boolean isNaggable() {
       Object result = null;
       try {
           result = Native.execute(this.inLibName, "__extends__PluginBase__"+this.name+"__isNaggable", this.blackBox, new Object[] {});
       } catch(Exception ex) {
           ex.printStackTrace();
           this.blackBox.getLogger().severe("The fact that an error was thrown at this stage indicates a severe error. Assuming the plugin can no longer run safely, it is being shut off.");
           this.blackBox.disable();
       }
       return (boolean) result;
    }
	public void setNaggable(boolean arg0) {
       Object result = null;
       try {
           result = Native.execute(this.inLibName, "__extends__PluginBase__"+this.name+"__setNaggable", this.blackBox, new Object[] {
               arg0
           });
       } catch(Exception ex) {
           ex.printStackTrace();
           this.blackBox.getLogger().severe("The fact that an error was thrown at this stage indicates a severe error. Assuming the plugin can no longer run safely, it is being shut off.");
           this.blackBox.disable();
       }
    }
	public org.bukkit.generator.ChunkGenerator getDefaultWorldGenerator(java.lang.String arg0, java.lang.String arg1) {
       Object result = null;
       try {
           result = Native.execute(this.inLibName, "__extends__PluginBase__"+this.name+"__getDefaultWorldGenerator", this.blackBox, new Object[] {
               arg0, arg1
           });
       } catch(Exception ex) {
           ex.printStackTrace();
           this.blackBox.getLogger().severe("The fact that an error was thrown at this stage indicates a severe error. Assuming the plugin can no longer run safely, it is being shut off.");
           this.blackBox.disable();
       }
       return (org.bukkit.generator.ChunkGenerator) result;
    }
	public java.io.InputStream getResource(java.lang.String arg0) {
       Object result = null;
       try {
           result = Native.execute(this.inLibName, "__extends__PluginBase__"+this.name+"__getResource", this.blackBox, new Object[] {
               arg0
           });
       } catch(Exception ex) {
           ex.printStackTrace();
           this.blackBox.getLogger().severe("The fact that an error was thrown at this stage indicates a severe error. Assuming the plugin can no longer run safely, it is being shut off.");
           this.blackBox.disable();
       }
       return (java.io.InputStream) result;
    }
	public java.util.logging.Logger getLogger() {
       Object result = null;
       try {
           result = Native.execute(this.inLibName, "__extends__PluginBase__"+this.name+"__getLogger", this.blackBox, new Object[] {});
       } catch(Exception ex) {
           ex.printStackTrace();
           this.blackBox.getLogger().severe("The fact that an error was thrown at this stage indicates a severe error. Assuming the plugin can no longer run safely, it is being shut off.");
           this.blackBox.disable();
       }
       return (java.util.logging.Logger) result;
    }
	public java.util.List<java.lang.String> onTabComplete(org.bukkit.command.CommandSender arg0, org.bukkit.command.Command arg1, java.lang.String arg2, java.lang.String[] arg3) {
       Object result = null;
       try {
           result = Native.execute(this.inLibName, "__extends__PluginBase__"+this.name+"__onTabComplete", this.blackBox, new Object[] {
               arg0, arg1, arg2, arg3
           });
       } catch(Exception ex) {
           ex.printStackTrace();
           this.blackBox.getLogger().severe("The fact that an error was thrown at this stage indicates a severe error. Assuming the plugin can no longer run safely, it is being shut off.");
           this.blackBox.disable();
       }
       return (java.util.List<java.lang.String>) result;
    }
	public boolean onCommand(org.bukkit.command.CommandSender arg0, org.bukkit.command.Command arg1, java.lang.String arg2, java.lang.String[] arg3) {
       Object result = null;
       try {
           result = Native.execute(this.inLibName, "__extends__PluginBase__"+this.name+"__onCommand", this.blackBox, new Object[] {
               arg0, arg1, arg2, arg3
           });
       } catch(Exception ex) {
           ex.printStackTrace();
           this.blackBox.getLogger().severe("The fact that an error was thrown at this stage indicates a severe error. Assuming the plugin can no longer run safely, it is being shut off.");
           this.blackBox.disable();
       }
       return (boolean) result;
    }
}