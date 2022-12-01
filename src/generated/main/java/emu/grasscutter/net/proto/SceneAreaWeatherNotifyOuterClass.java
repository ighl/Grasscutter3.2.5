// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.WireFormat;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.Message;
import java.io.InputStream;
import com.google.protobuf.ByteString;
import java.nio.ByteBuffer;
import java.util.Iterator;
import com.google.protobuf.CodedOutputStream;
import java.util.Map;
import java.io.IOException;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.MapEntry;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Parser;
import com.google.protobuf.MapField;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Descriptors;

public final class SceneAreaWeatherNotifyOuterClass
{
    private static final Descriptors.Descriptor internal_static_SceneAreaWeatherNotify_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_SceneAreaWeatherNotify_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SceneAreaWeatherNotify_WeatherValueMapEntry_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_SceneAreaWeatherNotify_WeatherValueMapEntry_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private SceneAreaWeatherNotifyOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return SceneAreaWeatherNotifyOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001cSceneAreaWeatherNotify.proto\"\u00fb\u0001\n\u0016SceneAreaWeatherNotify\u0012\u0017\n\u000fweather_area_id\u0018\u000e \u0001(\r\u0012\u0019\n\u0011weather_gadget_id\u0018\r \u0001(\r\u0012\u0014\n\fclimate_type\u0018\n \u0001(\r\u0012\u0016\n\u000etrans_duration\u0018\u0003 \u0001(\u0002\u0012G\n\u0011weather_value_map\u0018\u000b \u0003(\u000b2,.SceneAreaWeatherNotify.WeatherValueMapEntry\u001a6\n\u0014WeatherValueMapEntry\u0012\u000b\n\u0003key\u0018\u0001 \u0001(\r\u0012\r\n\u0005value\u0018\u0002 \u0001(\t:\u00028\u0001B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        SceneAreaWeatherNotifyOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_SceneAreaWeatherNotify_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_SceneAreaWeatherNotify_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(SceneAreaWeatherNotifyOuterClass.internal_static_SceneAreaWeatherNotify_descriptor, new String[] { "WeatherAreaId", "WeatherGadgetId", "ClimateType", "TransDuration", "WeatherValueMap" });
        internal_static_SceneAreaWeatherNotify_WeatherValueMapEntry_descriptor = SceneAreaWeatherNotifyOuterClass.internal_static_SceneAreaWeatherNotify_descriptor.getNestedTypes().get(0);
        internal_static_SceneAreaWeatherNotify_WeatherValueMapEntry_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(SceneAreaWeatherNotifyOuterClass.internal_static_SceneAreaWeatherNotify_WeatherValueMapEntry_descriptor, new String[] { "Key", "Value" });
    }
    
    public static final class SceneAreaWeatherNotify extends GeneratedMessageV3 implements SceneAreaWeatherNotifyOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int WEATHER_AREA_ID_FIELD_NUMBER = 14;
        private int weatherAreaId_;
        public static final int WEATHER_GADGET_ID_FIELD_NUMBER = 13;
        private int weatherGadgetId_;
        public static final int CLIMATE_TYPE_FIELD_NUMBER = 10;
        private int climateType_;
        public static final int TRANS_DURATION_FIELD_NUMBER = 3;
        private float transDuration_;
        public static final int WEATHER_VALUE_MAP_FIELD_NUMBER = 11;
        private MapField<Integer, String> weatherValueMap_;
        private byte memoizedIsInitialized;
        private static final SceneAreaWeatherNotify DEFAULT_INSTANCE;
        private static final Parser<SceneAreaWeatherNotify> PARSER;
        
        private SceneAreaWeatherNotify(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private SceneAreaWeatherNotify() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new SceneAreaWeatherNotify();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private SceneAreaWeatherNotify(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new NullPointerException();
            }
            int mutable_bitField0_ = 0;
            final UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    final int tag = input.readTag();
                    switch (tag) {
                        case 0: {
                            done = true;
                            continue;
                        }
                        case 29: {
                            this.transDuration_ = input.readFloat();
                            continue;
                        }
                        case 80: {
                            this.climateType_ = input.readUInt32();
                            continue;
                        }
                        case 90: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.weatherValueMap_ = MapField.newMapField(WeatherValueMapDefaultEntryHolder.defaultEntry);
                                mutable_bitField0_ |= 0x1;
                            }
                            final MapEntry<Integer, String> weatherValueMap__ = input.readMessage(WeatherValueMapDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
                            this.weatherValueMap_.getMutableMap().put(weatherValueMap__.getKey(), weatherValueMap__.getValue());
                            continue;
                        }
                        case 104: {
                            this.weatherGadgetId_ = input.readUInt32();
                            continue;
                        }
                        case 112: {
                            this.weatherAreaId_ = input.readUInt32();
                            continue;
                        }
                        default: {
                            if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                                done = true;
                                continue;
                            }
                            continue;
                        }
                    }
                }
            }
            catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            }
            catch (IOException e2) {
                throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
            }
            finally {
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return SceneAreaWeatherNotifyOuterClass.internal_static_SceneAreaWeatherNotify_descriptor;
        }
        
        @Override
        protected MapField internalGetMapField(final int number) {
            switch (number) {
                case 11: {
                    return this.internalGetWeatherValueMap();
                }
                default: {
                    throw new RuntimeException("Invalid map field number: " + number);
                }
            }
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return SceneAreaWeatherNotifyOuterClass.internal_static_SceneAreaWeatherNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(SceneAreaWeatherNotify.class, Builder.class);
        }
        
        @Override
        public int getWeatherAreaId() {
            return this.weatherAreaId_;
        }
        
        @Override
        public int getWeatherGadgetId() {
            return this.weatherGadgetId_;
        }
        
        @Override
        public int getClimateType() {
            return this.climateType_;
        }
        
        @Override
        public float getTransDuration() {
            return this.transDuration_;
        }
        
        private MapField<Integer, String> internalGetWeatherValueMap() {
            if (this.weatherValueMap_ == null) {
                return MapField.emptyMapField(WeatherValueMapDefaultEntryHolder.defaultEntry);
            }
            return this.weatherValueMap_;
        }
        
        @Override
        public int getWeatherValueMapCount() {
            return this.internalGetWeatherValueMap().getMap().size();
        }
        
        @Override
        public boolean containsWeatherValueMap(final int key) {
            return this.internalGetWeatherValueMap().getMap().containsKey(key);
        }
        
        @Deprecated
        @Override
        public Map<Integer, String> getWeatherValueMap() {
            return this.getWeatherValueMapMap();
        }
        
        @Override
        public Map<Integer, String> getWeatherValueMapMap() {
            return this.internalGetWeatherValueMap().getMap();
        }
        
        @Override
        public String getWeatherValueMapOrDefault(final int key, final String defaultValue) {
            final Map<Integer, String> map = this.internalGetWeatherValueMap().getMap();
            return map.containsKey(key) ? map.get(key) : defaultValue;
        }
        
        @Override
        public String getWeatherValueMapOrThrow(final int key) {
            final Map<Integer, String> map = this.internalGetWeatherValueMap().getMap();
            if (!map.containsKey(key)) {
                throw new IllegalArgumentException();
            }
            return map.get(key);
        }
        
        @Override
        public final boolean isInitialized() {
            final byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == 1) {
                return true;
            }
            if (isInitialized == 0) {
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }
        
        @Override
        public void writeTo(final CodedOutputStream output) throws IOException {
            if (this.transDuration_ != 0.0f) {
                output.writeFloat(3, this.transDuration_);
            }
            if (this.climateType_ != 0) {
                output.writeUInt32(10, this.climateType_);
            }
            GeneratedMessageV3.serializeIntegerMapTo(output, this.internalGetWeatherValueMap(), WeatherValueMapDefaultEntryHolder.defaultEntry, 11);
            if (this.weatherGadgetId_ != 0) {
                output.writeUInt32(13, this.weatherGadgetId_);
            }
            if (this.weatherAreaId_ != 0) {
                output.writeUInt32(14, this.weatherAreaId_);
            }
            this.unknownFields.writeTo(output);
        }
        
        @Override
        public int getSerializedSize() {
            int size = this.memoizedSize;
            if (size != -1) {
                return size;
            }
            size = 0;
            if (this.transDuration_ != 0.0f) {
                size += CodedOutputStream.computeFloatSize(3, this.transDuration_);
            }
            if (this.climateType_ != 0) {
                size += CodedOutputStream.computeUInt32Size(10, this.climateType_);
            }
            for (final Map.Entry<Integer, String> entry : this.internalGetWeatherValueMap().getMap().entrySet()) {
                final MapEntry<Integer, String> weatherValueMap__ = WeatherValueMapDefaultEntryHolder.defaultEntry.newBuilderForType().setKey(entry.getKey()).setValue(entry.getValue()).build();
                size += CodedOutputStream.computeMessageSize(11, weatherValueMap__);
            }
            if (this.weatherGadgetId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(13, this.weatherGadgetId_);
            }
            if (this.weatherAreaId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(14, this.weatherAreaId_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SceneAreaWeatherNotify)) {
                return super.equals(obj);
            }
            final SceneAreaWeatherNotify other = (SceneAreaWeatherNotify)obj;
            return this.getWeatherAreaId() == other.getWeatherAreaId() && this.getWeatherGadgetId() == other.getWeatherGadgetId() && this.getClimateType() == other.getClimateType() && Float.floatToIntBits(this.getTransDuration()) == Float.floatToIntBits(other.getTransDuration()) && this.internalGetWeatherValueMap().equals(other.internalGetWeatherValueMap()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 14;
            hash = 53 * hash + this.getWeatherAreaId();
            hash = 37 * hash + 13;
            hash = 53 * hash + this.getWeatherGadgetId();
            hash = 37 * hash + 10;
            hash = 53 * hash + this.getClimateType();
            hash = 37 * hash + 3;
            hash = 53 * hash + Float.floatToIntBits(this.getTransDuration());
            if (!this.internalGetWeatherValueMap().getMap().isEmpty()) {
                hash = 37 * hash + 11;
                hash = 53 * hash + this.internalGetWeatherValueMap().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static SceneAreaWeatherNotify parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return SceneAreaWeatherNotify.PARSER.parseFrom(data);
        }
        
        public static SceneAreaWeatherNotify parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return SceneAreaWeatherNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static SceneAreaWeatherNotify parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return SceneAreaWeatherNotify.PARSER.parseFrom(data);
        }
        
        public static SceneAreaWeatherNotify parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return SceneAreaWeatherNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static SceneAreaWeatherNotify parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return SceneAreaWeatherNotify.PARSER.parseFrom(data);
        }
        
        public static SceneAreaWeatherNotify parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return SceneAreaWeatherNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static SceneAreaWeatherNotify parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SceneAreaWeatherNotify.PARSER, input);
        }
        
        public static SceneAreaWeatherNotify parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SceneAreaWeatherNotify.PARSER, input, extensionRegistry);
        }
        
        public static SceneAreaWeatherNotify parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(SceneAreaWeatherNotify.PARSER, input);
        }
        
        public static SceneAreaWeatherNotify parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(SceneAreaWeatherNotify.PARSER, input, extensionRegistry);
        }
        
        public static SceneAreaWeatherNotify parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SceneAreaWeatherNotify.PARSER, input);
        }
        
        public static SceneAreaWeatherNotify parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SceneAreaWeatherNotify.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return SceneAreaWeatherNotify.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final SceneAreaWeatherNotify prototype) {
            return SceneAreaWeatherNotify.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == SceneAreaWeatherNotify.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static SceneAreaWeatherNotify getDefaultInstance() {
            return SceneAreaWeatherNotify.DEFAULT_INSTANCE;
        }
        
        public static Parser<SceneAreaWeatherNotify> parser() {
            return SceneAreaWeatherNotify.PARSER;
        }
        
        @Override
        public Parser<SceneAreaWeatherNotify> getParserForType() {
            return SceneAreaWeatherNotify.PARSER;
        }
        
        @Override
        public SceneAreaWeatherNotify getDefaultInstanceForType() {
            return SceneAreaWeatherNotify.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new SceneAreaWeatherNotify();
            PARSER = new AbstractParser<SceneAreaWeatherNotify>() {
                @Override
                public SceneAreaWeatherNotify parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new SceneAreaWeatherNotify(input, extensionRegistry);
                }
            };
        }
        
        private static final class WeatherValueMapDefaultEntryHolder
        {
            static final MapEntry<Integer, String> defaultEntry;
            
            static {
                defaultEntry = MapEntry.newDefaultInstance(SceneAreaWeatherNotifyOuterClass.internal_static_SceneAreaWeatherNotify_WeatherValueMapEntry_descriptor, WireFormat.FieldType.UINT32, 0, WireFormat.FieldType.STRING, "");
            }
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SceneAreaWeatherNotifyOrBuilder
        {
            private int bitField0_;
            private int weatherAreaId_;
            private int weatherGadgetId_;
            private int climateType_;
            private float transDuration_;
            private MapField<Integer, String> weatherValueMap_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return SceneAreaWeatherNotifyOuterClass.internal_static_SceneAreaWeatherNotify_descriptor;
            }
            
            @Override
            protected MapField internalGetMapField(final int number) {
                switch (number) {
                    case 11: {
                        return this.internalGetWeatherValueMap();
                    }
                    default: {
                        throw new RuntimeException("Invalid map field number: " + number);
                    }
                }
            }
            
            @Override
            protected MapField internalGetMutableMapField(final int number) {
                switch (number) {
                    case 11: {
                        return this.internalGetMutableWeatherValueMap();
                    }
                    default: {
                        throw new RuntimeException("Invalid map field number: " + number);
                    }
                }
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return SceneAreaWeatherNotifyOuterClass.internal_static_SceneAreaWeatherNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(SceneAreaWeatherNotify.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (SceneAreaWeatherNotify.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.weatherAreaId_ = 0;
                this.weatherGadgetId_ = 0;
                this.climateType_ = 0;
                this.transDuration_ = 0.0f;
                this.internalGetMutableWeatherValueMap().clear();
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return SceneAreaWeatherNotifyOuterClass.internal_static_SceneAreaWeatherNotify_descriptor;
            }
            
            @Override
            public SceneAreaWeatherNotify getDefaultInstanceForType() {
                return SceneAreaWeatherNotify.getDefaultInstance();
            }
            
            @Override
            public SceneAreaWeatherNotify build() {
                final SceneAreaWeatherNotify result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public SceneAreaWeatherNotify buildPartial() {
                final SceneAreaWeatherNotify result = new SceneAreaWeatherNotify(this);
                final int from_bitField0_ = this.bitField0_;
                result.weatherAreaId_ = this.weatherAreaId_;
                result.weatherGadgetId_ = this.weatherGadgetId_;
                result.climateType_ = this.climateType_;
                result.transDuration_ = this.transDuration_;
                (result.weatherValueMap_ = this.internalGetWeatherValueMap()).makeImmutable();
                this.onBuilt();
                return result;
            }
            
            @Override
            public Builder clone() {
                return super.clone();
            }
            
            @Override
            public Builder setField(final Descriptors.FieldDescriptor field, final Object value) {
                return super.setField(field, value);
            }
            
            @Override
            public Builder clearField(final Descriptors.FieldDescriptor field) {
                return super.clearField(field);
            }
            
            @Override
            public Builder clearOneof(final Descriptors.OneofDescriptor oneof) {
                return super.clearOneof(oneof);
            }
            
            @Override
            public Builder setRepeatedField(final Descriptors.FieldDescriptor field, final int index, final Object value) {
                return super.setRepeatedField(field, index, value);
            }
            
            @Override
            public Builder addRepeatedField(final Descriptors.FieldDescriptor field, final Object value) {
                return super.addRepeatedField(field, value);
            }
            
            @Override
            public Builder mergeFrom(final Message other) {
                if (other instanceof SceneAreaWeatherNotify) {
                    return this.mergeFrom((SceneAreaWeatherNotify)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final SceneAreaWeatherNotify other) {
                if (other == SceneAreaWeatherNotify.getDefaultInstance()) {
                    return this;
                }
                if (other.getWeatherAreaId() != 0) {
                    this.setWeatherAreaId(other.getWeatherAreaId());
                }
                if (other.getWeatherGadgetId() != 0) {
                    this.setWeatherGadgetId(other.getWeatherGadgetId());
                }
                if (other.getClimateType() != 0) {
                    this.setClimateType(other.getClimateType());
                }
                if (other.getTransDuration() != 0.0f) {
                    this.setTransDuration(other.getTransDuration());
                }
                this.internalGetMutableWeatherValueMap().mergeFrom(other.internalGetWeatherValueMap());
                this.mergeUnknownFields(other.unknownFields);
                this.onChanged();
                return this;
            }
            
            @Override
            public final boolean isInitialized() {
                return true;
            }
            
            @Override
            public Builder mergeFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
                SceneAreaWeatherNotify parsedMessage = null;
                try {
                    parsedMessage = SceneAreaWeatherNotify.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (SceneAreaWeatherNotify)e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                }
                finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            
            @Override
            public int getWeatherAreaId() {
                return this.weatherAreaId_;
            }
            
            public Builder setWeatherAreaId(final int value) {
                this.weatherAreaId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearWeatherAreaId() {
                this.weatherAreaId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getWeatherGadgetId() {
                return this.weatherGadgetId_;
            }
            
            public Builder setWeatherGadgetId(final int value) {
                this.weatherGadgetId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearWeatherGadgetId() {
                this.weatherGadgetId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getClimateType() {
                return this.climateType_;
            }
            
            public Builder setClimateType(final int value) {
                this.climateType_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearClimateType() {
                this.climateType_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public float getTransDuration() {
                return this.transDuration_;
            }
            
            public Builder setTransDuration(final float value) {
                this.transDuration_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearTransDuration() {
                this.transDuration_ = 0.0f;
                this.onChanged();
                return this;
            }
            
            private MapField<Integer, String> internalGetWeatherValueMap() {
                if (this.weatherValueMap_ == null) {
                    return MapField.emptyMapField(WeatherValueMapDefaultEntryHolder.defaultEntry);
                }
                return this.weatherValueMap_;
            }
            
            private MapField<Integer, String> internalGetMutableWeatherValueMap() {
                this.onChanged();
                if (this.weatherValueMap_ == null) {
                    this.weatherValueMap_ = MapField.newMapField(WeatherValueMapDefaultEntryHolder.defaultEntry);
                }
                if (!this.weatherValueMap_.isMutable()) {
                    this.weatherValueMap_ = this.weatherValueMap_.copy();
                }
                return this.weatherValueMap_;
            }
            
            @Override
            public int getWeatherValueMapCount() {
                return this.internalGetWeatherValueMap().getMap().size();
            }
            
            @Override
            public boolean containsWeatherValueMap(final int key) {
                return this.internalGetWeatherValueMap().getMap().containsKey(key);
            }
            
            @Deprecated
            @Override
            public Map<Integer, String> getWeatherValueMap() {
                return this.getWeatherValueMapMap();
            }
            
            @Override
            public Map<Integer, String> getWeatherValueMapMap() {
                return this.internalGetWeatherValueMap().getMap();
            }
            
            @Override
            public String getWeatherValueMapOrDefault(final int key, final String defaultValue) {
                final Map<Integer, String> map = this.internalGetWeatherValueMap().getMap();
                return map.containsKey(key) ? map.get(key) : defaultValue;
            }
            
            @Override
            public String getWeatherValueMapOrThrow(final int key) {
                final Map<Integer, String> map = this.internalGetWeatherValueMap().getMap();
                if (!map.containsKey(key)) {
                    throw new IllegalArgumentException();
                }
                return map.get(key);
            }
            
            public Builder clearWeatherValueMap() {
                this.internalGetMutableWeatherValueMap().getMutableMap().clear();
                return this;
            }
            
            public Builder removeWeatherValueMap(final int key) {
                this.internalGetMutableWeatherValueMap().getMutableMap().remove(key);
                return this;
            }
            
            @Deprecated
            public Map<Integer, String> getMutableWeatherValueMap() {
                return this.internalGetMutableWeatherValueMap().getMutableMap();
            }
            
            public Builder putWeatherValueMap(final int key, final String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.internalGetMutableWeatherValueMap().getMutableMap().put(key, value);
                return this;
            }
            
            public Builder putAllWeatherValueMap(final Map<Integer, String> values) {
                this.internalGetMutableWeatherValueMap().getMutableMap().putAll(values);
                return this;
            }
            
            @Override
            public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }
            
            @Override
            public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }
        }
    }
    
    public interface SceneAreaWeatherNotifyOrBuilder extends MessageOrBuilder
    {
        int getWeatherAreaId();
        
        int getWeatherGadgetId();
        
        int getClimateType();
        
        float getTransDuration();
        
        int getWeatherValueMapCount();
        
        boolean containsWeatherValueMap(final int p0);
        
        @Deprecated
        Map<Integer, String> getWeatherValueMap();
        
        Map<Integer, String> getWeatherValueMapMap();
        
        String getWeatherValueMapOrDefault(final int p0, final String p1);
        
        String getWeatherValueMapOrThrow(final int p0);
    }
}
