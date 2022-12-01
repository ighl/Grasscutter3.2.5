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

public final class LunchBoxDataOuterClass
{
    private static final Descriptors.Descriptor internal_static_LunchBoxData_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_LunchBoxData_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_LunchBoxData_SlotMaterialMapEntry_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_LunchBoxData_SlotMaterialMapEntry_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private LunchBoxDataOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return LunchBoxDataOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0012LunchBoxData.proto\"\u0085\u0001\n\fLunchBoxData\u0012=\n\u0011slot_material_map\u0018\u0003 \u0003(\u000b2\".LunchBoxData.SlotMaterialMapEntry\u001a6\n\u0014SlotMaterialMapEntry\u0012\u000b\n\u0003key\u0018\u0001 \u0001(\r\u0012\r\n\u0005value\u0018\u0002 \u0001(\r:\u00028\u0001B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        LunchBoxDataOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_LunchBoxData_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_LunchBoxData_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(LunchBoxDataOuterClass.internal_static_LunchBoxData_descriptor, new String[] { "SlotMaterialMap" });
        internal_static_LunchBoxData_SlotMaterialMapEntry_descriptor = LunchBoxDataOuterClass.internal_static_LunchBoxData_descriptor.getNestedTypes().get(0);
        internal_static_LunchBoxData_SlotMaterialMapEntry_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(LunchBoxDataOuterClass.internal_static_LunchBoxData_SlotMaterialMapEntry_descriptor, new String[] { "Key", "Value" });
    }
    
    public static final class LunchBoxData extends GeneratedMessageV3 implements LunchBoxDataOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int SLOT_MATERIAL_MAP_FIELD_NUMBER = 3;
        private MapField<Integer, Integer> slotMaterialMap_;
        private byte memoizedIsInitialized;
        private static final LunchBoxData DEFAULT_INSTANCE;
        private static final Parser<LunchBoxData> PARSER;
        
        private LunchBoxData(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private LunchBoxData() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new LunchBoxData();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private LunchBoxData(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 26: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.slotMaterialMap_ = MapField.newMapField(SlotMaterialMapDefaultEntryHolder.defaultEntry);
                                mutable_bitField0_ |= 0x1;
                            }
                            final MapEntry<Integer, Integer> slotMaterialMap__ = input.readMessage(SlotMaterialMapDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
                            this.slotMaterialMap_.getMutableMap().put(slotMaterialMap__.getKey(), slotMaterialMap__.getValue());
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
            return LunchBoxDataOuterClass.internal_static_LunchBoxData_descriptor;
        }
        
        @Override
        protected MapField internalGetMapField(final int number) {
            switch (number) {
                case 3: {
                    return this.internalGetSlotMaterialMap();
                }
                default: {
                    throw new RuntimeException("Invalid map field number: " + number);
                }
            }
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return LunchBoxDataOuterClass.internal_static_LunchBoxData_fieldAccessorTable.ensureFieldAccessorsInitialized(LunchBoxData.class, Builder.class);
        }
        
        private MapField<Integer, Integer> internalGetSlotMaterialMap() {
            if (this.slotMaterialMap_ == null) {
                return MapField.emptyMapField(SlotMaterialMapDefaultEntryHolder.defaultEntry);
            }
            return this.slotMaterialMap_;
        }
        
        @Override
        public int getSlotMaterialMapCount() {
            return this.internalGetSlotMaterialMap().getMap().size();
        }
        
        @Override
        public boolean containsSlotMaterialMap(final int key) {
            return this.internalGetSlotMaterialMap().getMap().containsKey(key);
        }
        
        @Deprecated
        @Override
        public Map<Integer, Integer> getSlotMaterialMap() {
            return this.getSlotMaterialMapMap();
        }
        
        @Override
        public Map<Integer, Integer> getSlotMaterialMapMap() {
            return this.internalGetSlotMaterialMap().getMap();
        }
        
        @Override
        public int getSlotMaterialMapOrDefault(final int key, final int defaultValue) {
            final Map<Integer, Integer> map = this.internalGetSlotMaterialMap().getMap();
            return map.containsKey(key) ? map.get(key) : defaultValue;
        }
        
        @Override
        public int getSlotMaterialMapOrThrow(final int key) {
            final Map<Integer, Integer> map = this.internalGetSlotMaterialMap().getMap();
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
            GeneratedMessageV3.serializeIntegerMapTo(output, this.internalGetSlotMaterialMap(), SlotMaterialMapDefaultEntryHolder.defaultEntry, 3);
            this.unknownFields.writeTo(output);
        }
        
        @Override
        public int getSerializedSize() {
            int size = this.memoizedSize;
            if (size != -1) {
                return size;
            }
            size = 0;
            for (final Map.Entry<Integer, Integer> entry : this.internalGetSlotMaterialMap().getMap().entrySet()) {
                final MapEntry<Integer, Integer> slotMaterialMap__ = SlotMaterialMapDefaultEntryHolder.defaultEntry.newBuilderForType().setKey(entry.getKey()).setValue(entry.getValue()).build();
                size += CodedOutputStream.computeMessageSize(3, slotMaterialMap__);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof LunchBoxData)) {
                return super.equals(obj);
            }
            final LunchBoxData other = (LunchBoxData)obj;
            return this.internalGetSlotMaterialMap().equals(other.internalGetSlotMaterialMap()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (!this.internalGetSlotMaterialMap().getMap().isEmpty()) {
                hash = 37 * hash + 3;
                hash = 53 * hash + this.internalGetSlotMaterialMap().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static LunchBoxData parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return LunchBoxData.PARSER.parseFrom(data);
        }
        
        public static LunchBoxData parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return LunchBoxData.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static LunchBoxData parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return LunchBoxData.PARSER.parseFrom(data);
        }
        
        public static LunchBoxData parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return LunchBoxData.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static LunchBoxData parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return LunchBoxData.PARSER.parseFrom(data);
        }
        
        public static LunchBoxData parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return LunchBoxData.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static LunchBoxData parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(LunchBoxData.PARSER, input);
        }
        
        public static LunchBoxData parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(LunchBoxData.PARSER, input, extensionRegistry);
        }
        
        public static LunchBoxData parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(LunchBoxData.PARSER, input);
        }
        
        public static LunchBoxData parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(LunchBoxData.PARSER, input, extensionRegistry);
        }
        
        public static LunchBoxData parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(LunchBoxData.PARSER, input);
        }
        
        public static LunchBoxData parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(LunchBoxData.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return LunchBoxData.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final LunchBoxData prototype) {
            return LunchBoxData.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == LunchBoxData.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static LunchBoxData getDefaultInstance() {
            return LunchBoxData.DEFAULT_INSTANCE;
        }
        
        public static Parser<LunchBoxData> parser() {
            return LunchBoxData.PARSER;
        }
        
        @Override
        public Parser<LunchBoxData> getParserForType() {
            return LunchBoxData.PARSER;
        }
        
        @Override
        public LunchBoxData getDefaultInstanceForType() {
            return LunchBoxData.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new LunchBoxData();
            PARSER = new AbstractParser<LunchBoxData>() {
                @Override
                public LunchBoxData parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new LunchBoxData(input, extensionRegistry);
                }
            };
        }
        
        private static final class SlotMaterialMapDefaultEntryHolder
        {
            static final MapEntry<Integer, Integer> defaultEntry;
            
            static {
                defaultEntry = MapEntry.newDefaultInstance(LunchBoxDataOuterClass.internal_static_LunchBoxData_SlotMaterialMapEntry_descriptor, WireFormat.FieldType.UINT32, 0, WireFormat.FieldType.UINT32, 0);
            }
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements LunchBoxDataOrBuilder
        {
            private int bitField0_;
            private MapField<Integer, Integer> slotMaterialMap_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return LunchBoxDataOuterClass.internal_static_LunchBoxData_descriptor;
            }
            
            @Override
            protected MapField internalGetMapField(final int number) {
                switch (number) {
                    case 3: {
                        return this.internalGetSlotMaterialMap();
                    }
                    default: {
                        throw new RuntimeException("Invalid map field number: " + number);
                    }
                }
            }
            
            @Override
            protected MapField internalGetMutableMapField(final int number) {
                switch (number) {
                    case 3: {
                        return this.internalGetMutableSlotMaterialMap();
                    }
                    default: {
                        throw new RuntimeException("Invalid map field number: " + number);
                    }
                }
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return LunchBoxDataOuterClass.internal_static_LunchBoxData_fieldAccessorTable.ensureFieldAccessorsInitialized(LunchBoxData.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (LunchBoxData.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.internalGetMutableSlotMaterialMap().clear();
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return LunchBoxDataOuterClass.internal_static_LunchBoxData_descriptor;
            }
            
            @Override
            public LunchBoxData getDefaultInstanceForType() {
                return LunchBoxData.getDefaultInstance();
            }
            
            @Override
            public LunchBoxData build() {
                final LunchBoxData result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public LunchBoxData buildPartial() {
                final LunchBoxData result = new LunchBoxData(this);
                final int from_bitField0_ = this.bitField0_;
                (result.slotMaterialMap_ = this.internalGetSlotMaterialMap()).makeImmutable();
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
                if (other instanceof LunchBoxData) {
                    return this.mergeFrom((LunchBoxData)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final LunchBoxData other) {
                if (other == LunchBoxData.getDefaultInstance()) {
                    return this;
                }
                this.internalGetMutableSlotMaterialMap().mergeFrom(other.internalGetSlotMaterialMap());
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
                LunchBoxData parsedMessage = null;
                try {
                    parsedMessage = LunchBoxData.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (LunchBoxData)e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                }
                finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            
            private MapField<Integer, Integer> internalGetSlotMaterialMap() {
                if (this.slotMaterialMap_ == null) {
                    return MapField.emptyMapField(SlotMaterialMapDefaultEntryHolder.defaultEntry);
                }
                return this.slotMaterialMap_;
            }
            
            private MapField<Integer, Integer> internalGetMutableSlotMaterialMap() {
                this.onChanged();
                if (this.slotMaterialMap_ == null) {
                    this.slotMaterialMap_ = MapField.newMapField(SlotMaterialMapDefaultEntryHolder.defaultEntry);
                }
                if (!this.slotMaterialMap_.isMutable()) {
                    this.slotMaterialMap_ = this.slotMaterialMap_.copy();
                }
                return this.slotMaterialMap_;
            }
            
            @Override
            public int getSlotMaterialMapCount() {
                return this.internalGetSlotMaterialMap().getMap().size();
            }
            
            @Override
            public boolean containsSlotMaterialMap(final int key) {
                return this.internalGetSlotMaterialMap().getMap().containsKey(key);
            }
            
            @Deprecated
            @Override
            public Map<Integer, Integer> getSlotMaterialMap() {
                return this.getSlotMaterialMapMap();
            }
            
            @Override
            public Map<Integer, Integer> getSlotMaterialMapMap() {
                return this.internalGetSlotMaterialMap().getMap();
            }
            
            @Override
            public int getSlotMaterialMapOrDefault(final int key, final int defaultValue) {
                final Map<Integer, Integer> map = this.internalGetSlotMaterialMap().getMap();
                return map.containsKey(key) ? map.get(key) : defaultValue;
            }
            
            @Override
            public int getSlotMaterialMapOrThrow(final int key) {
                final Map<Integer, Integer> map = this.internalGetSlotMaterialMap().getMap();
                if (!map.containsKey(key)) {
                    throw new IllegalArgumentException();
                }
                return map.get(key);
            }
            
            public Builder clearSlotMaterialMap() {
                this.internalGetMutableSlotMaterialMap().getMutableMap().clear();
                return this;
            }
            
            public Builder removeSlotMaterialMap(final int key) {
                this.internalGetMutableSlotMaterialMap().getMutableMap().remove(key);
                return this;
            }
            
            @Deprecated
            public Map<Integer, Integer> getMutableSlotMaterialMap() {
                return this.internalGetMutableSlotMaterialMap().getMutableMap();
            }
            
            public Builder putSlotMaterialMap(final int key, final int value) {
                this.internalGetMutableSlotMaterialMap().getMutableMap().put(key, value);
                return this;
            }
            
            public Builder putAllSlotMaterialMap(final Map<Integer, Integer> values) {
                this.internalGetMutableSlotMaterialMap().getMutableMap().putAll(values);
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
    
    public interface LunchBoxDataOrBuilder extends MessageOrBuilder
    {
        int getSlotMaterialMapCount();
        
        boolean containsSlotMaterialMap(final int p0);
        
        @Deprecated
        Map<Integer, Integer> getSlotMaterialMap();
        
        Map<Integer, Integer> getSlotMaterialMapMap();
        
        int getSlotMaterialMapOrDefault(final int p0, final int p1);
        
        int getSlotMaterialMapOrThrow(final int p0);
    }
}
