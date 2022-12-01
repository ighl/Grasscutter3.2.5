// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.WireFormat;
import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;
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

public final class WorldDataNotifyOuterClass
{
    private static final Descriptors.Descriptor internal_static_WorldDataNotify_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_WorldDataNotify_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_WorldDataNotify_WorldPropMapEntry_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_WorldDataNotify_WorldPropMapEntry_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private WorldDataNotifyOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return WorldDataNotifyOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0015WorldDataNotify.proto\u001a\u000fPropValue.proto\"\u00e6\u0001\n\u000fWorldDataNotify\u0012:\n\u000eworld_prop_map\u0018\r \u0003(\u000b2\".WorldDataNotify.WorldPropMapEntry\u001a?\n\u0011WorldPropMapEntry\u0012\u000b\n\u0003key\u0018\u0001 \u0001(\r\u0012\u0019\n\u0005value\u0018\u0002 \u0001(\u000b2\n.PropValue:\u00028\u0001\"V\n\bDataType\u0012\u0012\n\u000eDATA_TYPE_NONE\u0010\u0000\u0012\u0019\n\u0015DATA_TYPE_WORLD_LEVEL\u0010\u0001\u0012\u001b\n\u0017DATA_TYPE_IS_IN_MP_MODE\u0010\u0002B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        WorldDataNotifyOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { PropValueOuterClass.getDescriptor() });
        internal_static_WorldDataNotify_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_WorldDataNotify_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(WorldDataNotifyOuterClass.internal_static_WorldDataNotify_descriptor, new String[] { "WorldPropMap" });
        internal_static_WorldDataNotify_WorldPropMapEntry_descriptor = WorldDataNotifyOuterClass.internal_static_WorldDataNotify_descriptor.getNestedTypes().get(0);
        internal_static_WorldDataNotify_WorldPropMapEntry_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(WorldDataNotifyOuterClass.internal_static_WorldDataNotify_WorldPropMapEntry_descriptor, new String[] { "Key", "Value" });
        PropValueOuterClass.getDescriptor();
    }
    
    public static final class WorldDataNotify extends GeneratedMessageV3 implements WorldDataNotifyOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int WORLD_PROP_MAP_FIELD_NUMBER = 13;
        private MapField<Integer, PropValueOuterClass.PropValue> worldPropMap_;
        private byte memoizedIsInitialized;
        private static final WorldDataNotify DEFAULT_INSTANCE;
        private static final Parser<WorldDataNotify> PARSER;
        
        private WorldDataNotify(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private WorldDataNotify() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new WorldDataNotify();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private WorldDataNotify(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 106: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.worldPropMap_ = MapField.newMapField(WorldPropMapDefaultEntryHolder.defaultEntry);
                                mutable_bitField0_ |= 0x1;
                            }
                            final MapEntry<Integer, PropValueOuterClass.PropValue> worldPropMap__ = input.readMessage(WorldPropMapDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
                            this.worldPropMap_.getMutableMap().put(worldPropMap__.getKey(), worldPropMap__.getValue());
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
            return WorldDataNotifyOuterClass.internal_static_WorldDataNotify_descriptor;
        }
        
        @Override
        protected MapField internalGetMapField(final int number) {
            switch (number) {
                case 13: {
                    return this.internalGetWorldPropMap();
                }
                default: {
                    throw new RuntimeException("Invalid map field number: " + number);
                }
            }
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return WorldDataNotifyOuterClass.internal_static_WorldDataNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(WorldDataNotify.class, Builder.class);
        }
        
        private MapField<Integer, PropValueOuterClass.PropValue> internalGetWorldPropMap() {
            if (this.worldPropMap_ == null) {
                return MapField.emptyMapField(WorldPropMapDefaultEntryHolder.defaultEntry);
            }
            return this.worldPropMap_;
        }
        
        @Override
        public int getWorldPropMapCount() {
            return this.internalGetWorldPropMap().getMap().size();
        }
        
        @Override
        public boolean containsWorldPropMap(final int key) {
            return this.internalGetWorldPropMap().getMap().containsKey(key);
        }
        
        @Deprecated
        @Override
        public Map<Integer, PropValueOuterClass.PropValue> getWorldPropMap() {
            return this.getWorldPropMapMap();
        }
        
        @Override
        public Map<Integer, PropValueOuterClass.PropValue> getWorldPropMapMap() {
            return this.internalGetWorldPropMap().getMap();
        }
        
        @Override
        public PropValueOuterClass.PropValue getWorldPropMapOrDefault(final int key, final PropValueOuterClass.PropValue defaultValue) {
            final Map<Integer, PropValueOuterClass.PropValue> map = this.internalGetWorldPropMap().getMap();
            return map.containsKey(key) ? map.get(key) : defaultValue;
        }
        
        @Override
        public PropValueOuterClass.PropValue getWorldPropMapOrThrow(final int key) {
            final Map<Integer, PropValueOuterClass.PropValue> map = this.internalGetWorldPropMap().getMap();
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
            GeneratedMessageV3.serializeIntegerMapTo(output, this.internalGetWorldPropMap(), WorldPropMapDefaultEntryHolder.defaultEntry, 13);
            this.unknownFields.writeTo(output);
        }
        
        @Override
        public int getSerializedSize() {
            int size = this.memoizedSize;
            if (size != -1) {
                return size;
            }
            size = 0;
            for (final Map.Entry<Integer, PropValueOuterClass.PropValue> entry : this.internalGetWorldPropMap().getMap().entrySet()) {
                final MapEntry<Integer, PropValueOuterClass.PropValue> worldPropMap__ = WorldPropMapDefaultEntryHolder.defaultEntry.newBuilderForType().setKey(entry.getKey()).setValue(entry.getValue()).build();
                size += CodedOutputStream.computeMessageSize(13, worldPropMap__);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof WorldDataNotify)) {
                return super.equals(obj);
            }
            final WorldDataNotify other = (WorldDataNotify)obj;
            return this.internalGetWorldPropMap().equals(other.internalGetWorldPropMap()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (!this.internalGetWorldPropMap().getMap().isEmpty()) {
                hash = 37 * hash + 13;
                hash = 53 * hash + this.internalGetWorldPropMap().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static WorldDataNotify parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return WorldDataNotify.PARSER.parseFrom(data);
        }
        
        public static WorldDataNotify parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return WorldDataNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static WorldDataNotify parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return WorldDataNotify.PARSER.parseFrom(data);
        }
        
        public static WorldDataNotify parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return WorldDataNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static WorldDataNotify parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return WorldDataNotify.PARSER.parseFrom(data);
        }
        
        public static WorldDataNotify parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return WorldDataNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static WorldDataNotify parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(WorldDataNotify.PARSER, input);
        }
        
        public static WorldDataNotify parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(WorldDataNotify.PARSER, input, extensionRegistry);
        }
        
        public static WorldDataNotify parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(WorldDataNotify.PARSER, input);
        }
        
        public static WorldDataNotify parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(WorldDataNotify.PARSER, input, extensionRegistry);
        }
        
        public static WorldDataNotify parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(WorldDataNotify.PARSER, input);
        }
        
        public static WorldDataNotify parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(WorldDataNotify.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return WorldDataNotify.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final WorldDataNotify prototype) {
            return WorldDataNotify.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == WorldDataNotify.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static WorldDataNotify getDefaultInstance() {
            return WorldDataNotify.DEFAULT_INSTANCE;
        }
        
        public static Parser<WorldDataNotify> parser() {
            return WorldDataNotify.PARSER;
        }
        
        @Override
        public Parser<WorldDataNotify> getParserForType() {
            return WorldDataNotify.PARSER;
        }
        
        @Override
        public WorldDataNotify getDefaultInstanceForType() {
            return WorldDataNotify.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new WorldDataNotify();
            PARSER = new AbstractParser<WorldDataNotify>() {
                @Override
                public WorldDataNotify parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new WorldDataNotify(input, extensionRegistry);
                }
            };
        }
        
        public enum DataType implements ProtocolMessageEnum
        {
            DATA_TYPE_NONE(0), 
            DATA_TYPE_WORLD_LEVEL(1), 
            DATA_TYPE_IS_IN_MP_MODE(2), 
            UNRECOGNIZED(-1);
            
            public static final int DATA_TYPE_NONE_VALUE = 0;
            public static final int DATA_TYPE_WORLD_LEVEL_VALUE = 1;
            public static final int DATA_TYPE_IS_IN_MP_MODE_VALUE = 2;
            private static final Internal.EnumLiteMap<DataType> internalValueMap;
            private static final DataType[] VALUES;
            private final int value;
            
            @Override
            public final int getNumber() {
                if (this == DataType.UNRECOGNIZED) {
                    throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
                }
                return this.value;
            }
            
            @Deprecated
            public static DataType valueOf(final int value) {
                return forNumber(value);
            }
            
            public static DataType forNumber(final int value) {
                switch (value) {
                    case 0: {
                        return DataType.DATA_TYPE_NONE;
                    }
                    case 1: {
                        return DataType.DATA_TYPE_WORLD_LEVEL;
                    }
                    case 2: {
                        return DataType.DATA_TYPE_IS_IN_MP_MODE;
                    }
                    default: {
                        return null;
                    }
                }
            }
            
            public static Internal.EnumLiteMap<DataType> internalGetValueMap() {
                return DataType.internalValueMap;
            }
            
            @Override
            public final Descriptors.EnumValueDescriptor getValueDescriptor() {
                if (this == DataType.UNRECOGNIZED) {
                    throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
                }
                return getDescriptor().getValues().get(this.ordinal());
            }
            
            @Override
            public final Descriptors.EnumDescriptor getDescriptorForType() {
                return getDescriptor();
            }
            
            public static final Descriptors.EnumDescriptor getDescriptor() {
                return WorldDataNotify.getDescriptor().getEnumTypes().get(0);
            }
            
            public static DataType valueOf(final Descriptors.EnumValueDescriptor desc) {
                if (desc.getType() != getDescriptor()) {
                    throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
                }
                if (desc.getIndex() == -1) {
                    return DataType.UNRECOGNIZED;
                }
                return DataType.VALUES[desc.getIndex()];
            }
            
            private DataType(final int value) {
                this.value = value;
            }
            
            private static /* synthetic */ DataType[] value() {
                return new DataType[] { DataType.DATA_TYPE_NONE, DataType.DATA_TYPE_WORLD_LEVEL, DataType.DATA_TYPE_IS_IN_MP_MODE, DataType.UNRECOGNIZED };
            }
            
            static {
                VALUES = values();
                internalValueMap = new Internal.EnumLiteMap<DataType>() {
                    @Override
                    public DataType findValueByNumber(final int number) {
                        return DataType.forNumber(number);
                    }
                };

        }
        }
        
        private static final class WorldPropMapDefaultEntryHolder
        {
            static final MapEntry<Integer, PropValueOuterClass.PropValue> defaultEntry;
            
            static {
                defaultEntry = MapEntry.newDefaultInstance(WorldDataNotifyOuterClass.internal_static_WorldDataNotify_WorldPropMapEntry_descriptor, WireFormat.FieldType.UINT32, 0, WireFormat.FieldType.MESSAGE, PropValueOuterClass.PropValue.getDefaultInstance());
            }
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements WorldDataNotifyOrBuilder
        {
            private int bitField0_;
            private MapField<Integer, PropValueOuterClass.PropValue> worldPropMap_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return WorldDataNotifyOuterClass.internal_static_WorldDataNotify_descriptor;
            }
            
            @Override
            protected MapField internalGetMapField(final int number) {
                switch (number) {
                    case 13: {
                        return this.internalGetWorldPropMap();
                    }
                    default: {
                        throw new RuntimeException("Invalid map field number: " + number);
                    }
                }
            }
            
            @Override
            protected MapField internalGetMutableMapField(final int number) {
                switch (number) {
                    case 13: {
                        return this.internalGetMutableWorldPropMap();
                    }
                    default: {
                        throw new RuntimeException("Invalid map field number: " + number);
                    }
                }
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return WorldDataNotifyOuterClass.internal_static_WorldDataNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(WorldDataNotify.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (WorldDataNotify.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.internalGetMutableWorldPropMap().clear();
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return WorldDataNotifyOuterClass.internal_static_WorldDataNotify_descriptor;
            }
            
            @Override
            public WorldDataNotify getDefaultInstanceForType() {
                return WorldDataNotify.getDefaultInstance();
            }
            
            @Override
            public WorldDataNotify build() {
                final WorldDataNotify result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public WorldDataNotify buildPartial() {
                final WorldDataNotify result = new WorldDataNotify(this);
                final int from_bitField0_ = this.bitField0_;
                (result.worldPropMap_ = this.internalGetWorldPropMap()).makeImmutable();
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
                if (other instanceof WorldDataNotify) {
                    return this.mergeFrom((WorldDataNotify)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final WorldDataNotify other) {
                if (other == WorldDataNotify.getDefaultInstance()) {
                    return this;
                }
                this.internalGetMutableWorldPropMap().mergeFrom(other.internalGetWorldPropMap());
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
                WorldDataNotify parsedMessage = null;
                try {
                    parsedMessage = WorldDataNotify.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (WorldDataNotify)e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                }
                finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            
            private MapField<Integer, PropValueOuterClass.PropValue> internalGetWorldPropMap() {
                if (this.worldPropMap_ == null) {
                    return MapField.emptyMapField(WorldPropMapDefaultEntryHolder.defaultEntry);
                }
                return this.worldPropMap_;
            }
            
            private MapField<Integer, PropValueOuterClass.PropValue> internalGetMutableWorldPropMap() {
                this.onChanged();
                if (this.worldPropMap_ == null) {
                    this.worldPropMap_ = MapField.newMapField(WorldPropMapDefaultEntryHolder.defaultEntry);
                }
                if (!this.worldPropMap_.isMutable()) {
                    this.worldPropMap_ = this.worldPropMap_.copy();
                }
                return this.worldPropMap_;
            }
            
            @Override
            public int getWorldPropMapCount() {
                return this.internalGetWorldPropMap().getMap().size();
            }
            
            @Override
            public boolean containsWorldPropMap(final int key) {
                return this.internalGetWorldPropMap().getMap().containsKey(key);
            }
            
            @Deprecated
            @Override
            public Map<Integer, PropValueOuterClass.PropValue> getWorldPropMap() {
                return this.getWorldPropMapMap();
            }
            
            @Override
            public Map<Integer, PropValueOuterClass.PropValue> getWorldPropMapMap() {
                return this.internalGetWorldPropMap().getMap();
            }
            
            @Override
            public PropValueOuterClass.PropValue getWorldPropMapOrDefault(final int key, final PropValueOuterClass.PropValue defaultValue) {
                final Map<Integer, PropValueOuterClass.PropValue> map = this.internalGetWorldPropMap().getMap();
                return map.containsKey(key) ? map.get(key) : defaultValue;
            }
            
            @Override
            public PropValueOuterClass.PropValue getWorldPropMapOrThrow(final int key) {
                final Map<Integer, PropValueOuterClass.PropValue> map = this.internalGetWorldPropMap().getMap();
                if (!map.containsKey(key)) {
                    throw new IllegalArgumentException();
                }
                return map.get(key);
            }
            
            public Builder clearWorldPropMap() {
                this.internalGetMutableWorldPropMap().getMutableMap().clear();
                return this;
            }
            
            public Builder removeWorldPropMap(final int key) {
                this.internalGetMutableWorldPropMap().getMutableMap().remove(key);
                return this;
            }
            
            @Deprecated
            public Map<Integer, PropValueOuterClass.PropValue> getMutableWorldPropMap() {
                return this.internalGetMutableWorldPropMap().getMutableMap();
            }
            
            public Builder putWorldPropMap(final int key, final PropValueOuterClass.PropValue value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.internalGetMutableWorldPropMap().getMutableMap().put(key, value);
                return this;
            }
            
            public Builder putAllWorldPropMap(final Map<Integer, PropValueOuterClass.PropValue> values) {
                this.internalGetMutableWorldPropMap().getMutableMap().putAll(values);
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
    
    public interface WorldDataNotifyOrBuilder extends MessageOrBuilder
    {
        int getWorldPropMapCount();
        
        boolean containsWorldPropMap(final int p0);
        
        @Deprecated
        Map<Integer, PropValueOuterClass.PropValue> getWorldPropMap();
        
        Map<Integer, PropValueOuterClass.PropValue> getWorldPropMapMap();
        
        PropValueOuterClass.PropValue getWorldPropMapOrDefault(final int p0, final PropValueOuterClass.PropValue p1);
        
        PropValueOuterClass.PropValue getWorldPropMapOrThrow(final int p0);
    }
}
