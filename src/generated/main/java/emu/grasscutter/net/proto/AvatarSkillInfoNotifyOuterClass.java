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
import com.google.protobuf.Internal;
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

public final class AvatarSkillInfoNotifyOuterClass
{
    private static final Descriptors.Descriptor internal_static_AvatarSkillInfoNotify_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_AvatarSkillInfoNotify_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_AvatarSkillInfoNotify_SkillMapEntry_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_AvatarSkillInfoNotify_SkillMapEntry_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private AvatarSkillInfoNotifyOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return AvatarSkillInfoNotifyOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001bAvatarSkillInfoNotify.proto\u001a\u0015AvatarSkillInfo.proto\"¡\u0001\n\u0015AvatarSkillInfoNotify\u00127\n\tskill_map\u0018\u000b \u0003(\u000b2$.AvatarSkillInfoNotify.SkillMapEntry\u0012\f\n\u0004guid\u0018\u0004 \u0001(\u0004\u001aA\n\rSkillMapEntry\u0012\u000b\n\u0003key\u0018\u0001 \u0001(\r\u0012\u001f\n\u0005value\u0018\u0002 \u0001(\u000b2\u0010.AvatarSkillInfo:\u00028\u0001B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        AvatarSkillInfoNotifyOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { AvatarSkillInfoOuterClass.getDescriptor() });
        internal_static_AvatarSkillInfoNotify_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_AvatarSkillInfoNotify_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(AvatarSkillInfoNotifyOuterClass.internal_static_AvatarSkillInfoNotify_descriptor, new String[] { "SkillMap", "Guid" });
        internal_static_AvatarSkillInfoNotify_SkillMapEntry_descriptor = AvatarSkillInfoNotifyOuterClass.internal_static_AvatarSkillInfoNotify_descriptor.getNestedTypes().get(0);
        internal_static_AvatarSkillInfoNotify_SkillMapEntry_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(AvatarSkillInfoNotifyOuterClass.internal_static_AvatarSkillInfoNotify_SkillMapEntry_descriptor, new String[] { "Key", "Value" });
        AvatarSkillInfoOuterClass.getDescriptor();
    }
    
    public static final class AvatarSkillInfoNotify extends GeneratedMessageV3 implements AvatarSkillInfoNotifyOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int SKILL_MAP_FIELD_NUMBER = 11;
        private MapField<Integer, AvatarSkillInfoOuterClass.AvatarSkillInfo> skillMap_;
        public static final int GUID_FIELD_NUMBER = 4;
        private long guid_;
        private byte memoizedIsInitialized;
        private static final AvatarSkillInfoNotify DEFAULT_INSTANCE;
        private static final Parser<AvatarSkillInfoNotify> PARSER;
        
        private AvatarSkillInfoNotify(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private AvatarSkillInfoNotify() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new AvatarSkillInfoNotify();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private AvatarSkillInfoNotify(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 32: {
                            this.guid_ = input.readUInt64();
                            continue;
                        }
                        case 90: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.skillMap_ = MapField.newMapField(SkillMapDefaultEntryHolder.defaultEntry);
                                mutable_bitField0_ |= 0x1;
                            }
                            final MapEntry<Integer, AvatarSkillInfoOuterClass.AvatarSkillInfo> skillMap__ = input.readMessage(SkillMapDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
                            this.skillMap_.getMutableMap().put(skillMap__.getKey(), skillMap__.getValue());
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
            return AvatarSkillInfoNotifyOuterClass.internal_static_AvatarSkillInfoNotify_descriptor;
        }
        
        @Override
        protected MapField internalGetMapField(final int number) {
            switch (number) {
                case 11: {
                    return this.internalGetSkillMap();
                }
                default: {
                    throw new RuntimeException("Invalid map field number: " + number);
                }
            }
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return AvatarSkillInfoNotifyOuterClass.internal_static_AvatarSkillInfoNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(AvatarSkillInfoNotify.class, Builder.class);
        }
        
        private MapField<Integer, AvatarSkillInfoOuterClass.AvatarSkillInfo> internalGetSkillMap() {
            if (this.skillMap_ == null) {
                return MapField.emptyMapField(SkillMapDefaultEntryHolder.defaultEntry);
            }
            return this.skillMap_;
        }
        
        @Override
        public int getSkillMapCount() {
            return this.internalGetSkillMap().getMap().size();
        }
        
        @Override
        public boolean containsSkillMap(final int key) {
            return this.internalGetSkillMap().getMap().containsKey(key);
        }
        
        @Deprecated
        @Override
        public Map<Integer, AvatarSkillInfoOuterClass.AvatarSkillInfo> getSkillMap() {
            return this.getSkillMapMap();
        }
        
        @Override
        public Map<Integer, AvatarSkillInfoOuterClass.AvatarSkillInfo> getSkillMapMap() {
            return this.internalGetSkillMap().getMap();
        }
        
        @Override
        public AvatarSkillInfoOuterClass.AvatarSkillInfo getSkillMapOrDefault(final int key, final AvatarSkillInfoOuterClass.AvatarSkillInfo defaultValue) {
            final Map<Integer, AvatarSkillInfoOuterClass.AvatarSkillInfo> map = this.internalGetSkillMap().getMap();
            return map.containsKey(key) ? map.get(key) : defaultValue;
        }
        
        @Override
        public AvatarSkillInfoOuterClass.AvatarSkillInfo getSkillMapOrThrow(final int key) {
            final Map<Integer, AvatarSkillInfoOuterClass.AvatarSkillInfo> map = this.internalGetSkillMap().getMap();
            if (!map.containsKey(key)) {
                throw new IllegalArgumentException();
            }
            return map.get(key);
        }
        
        @Override
        public long getGuid() {
            return this.guid_;
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
            if (this.guid_ != 0L) {
                output.writeUInt64(4, this.guid_);
            }
            GeneratedMessageV3.serializeIntegerMapTo(output, this.internalGetSkillMap(), SkillMapDefaultEntryHolder.defaultEntry, 11);
            this.unknownFields.writeTo(output);
        }
        
        @Override
        public int getSerializedSize() {
            int size = this.memoizedSize;
            if (size != -1) {
                return size;
            }
            size = 0;
            if (this.guid_ != 0L) {
                size += CodedOutputStream.computeUInt64Size(4, this.guid_);
            }
            for (final Map.Entry<Integer, AvatarSkillInfoOuterClass.AvatarSkillInfo> entry : this.internalGetSkillMap().getMap().entrySet()) {
                final MapEntry<Integer, AvatarSkillInfoOuterClass.AvatarSkillInfo> skillMap__ = SkillMapDefaultEntryHolder.defaultEntry.newBuilderForType().setKey(entry.getKey()).setValue(entry.getValue()).build();
                size += CodedOutputStream.computeMessageSize(11, skillMap__);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AvatarSkillInfoNotify)) {
                return super.equals(obj);
            }
            final AvatarSkillInfoNotify other = (AvatarSkillInfoNotify)obj;
            return this.internalGetSkillMap().equals(other.internalGetSkillMap()) && this.getGuid() == other.getGuid() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (!this.internalGetSkillMap().getMap().isEmpty()) {
                hash = 37 * hash + 11;
                hash = 53 * hash + this.internalGetSkillMap().hashCode();
            }
            hash = 37 * hash + 4;
            hash = 53 * hash + Internal.hashLong(this.getGuid());
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static AvatarSkillInfoNotify parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return AvatarSkillInfoNotify.PARSER.parseFrom(data);
        }
        
        public static AvatarSkillInfoNotify parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AvatarSkillInfoNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AvatarSkillInfoNotify parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return AvatarSkillInfoNotify.PARSER.parseFrom(data);
        }
        
        public static AvatarSkillInfoNotify parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AvatarSkillInfoNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AvatarSkillInfoNotify parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return AvatarSkillInfoNotify.PARSER.parseFrom(data);
        }
        
        public static AvatarSkillInfoNotify parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AvatarSkillInfoNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AvatarSkillInfoNotify parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AvatarSkillInfoNotify.PARSER, input);
        }
        
        public static AvatarSkillInfoNotify parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AvatarSkillInfoNotify.PARSER, input, extensionRegistry);
        }
        
        public static AvatarSkillInfoNotify parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(AvatarSkillInfoNotify.PARSER, input);
        }
        
        public static AvatarSkillInfoNotify parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(AvatarSkillInfoNotify.PARSER, input, extensionRegistry);
        }
        
        public static AvatarSkillInfoNotify parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AvatarSkillInfoNotify.PARSER, input);
        }
        
        public static AvatarSkillInfoNotify parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AvatarSkillInfoNotify.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return AvatarSkillInfoNotify.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final AvatarSkillInfoNotify prototype) {
            return AvatarSkillInfoNotify.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == AvatarSkillInfoNotify.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static AvatarSkillInfoNotify getDefaultInstance() {
            return AvatarSkillInfoNotify.DEFAULT_INSTANCE;
        }
        
        public static Parser<AvatarSkillInfoNotify> parser() {
            return AvatarSkillInfoNotify.PARSER;
        }
        
        @Override
        public Parser<AvatarSkillInfoNotify> getParserForType() {
            return AvatarSkillInfoNotify.PARSER;
        }
        
        @Override
        public AvatarSkillInfoNotify getDefaultInstanceForType() {
            return AvatarSkillInfoNotify.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new AvatarSkillInfoNotify();
            PARSER = new AbstractParser<AvatarSkillInfoNotify>() {
                @Override
                public AvatarSkillInfoNotify parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new AvatarSkillInfoNotify(input, extensionRegistry);
                }
            };
        }
        
        private static final class SkillMapDefaultEntryHolder
        {
            static final MapEntry<Integer, AvatarSkillInfoOuterClass.AvatarSkillInfo> defaultEntry;
            
            static {
                defaultEntry = MapEntry.newDefaultInstance(AvatarSkillInfoNotifyOuterClass.internal_static_AvatarSkillInfoNotify_SkillMapEntry_descriptor, WireFormat.FieldType.UINT32, 0, WireFormat.FieldType.MESSAGE, AvatarSkillInfoOuterClass.AvatarSkillInfo.getDefaultInstance());
            }
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AvatarSkillInfoNotifyOrBuilder
        {
            private int bitField0_;
            private MapField<Integer, AvatarSkillInfoOuterClass.AvatarSkillInfo> skillMap_;
            private long guid_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return AvatarSkillInfoNotifyOuterClass.internal_static_AvatarSkillInfoNotify_descriptor;
            }
            
            @Override
            protected MapField internalGetMapField(final int number) {
                switch (number) {
                    case 11: {
                        return this.internalGetSkillMap();
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
                        return this.internalGetMutableSkillMap();
                    }
                    default: {
                        throw new RuntimeException("Invalid map field number: " + number);
                    }
                }
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return AvatarSkillInfoNotifyOuterClass.internal_static_AvatarSkillInfoNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(AvatarSkillInfoNotify.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (AvatarSkillInfoNotify.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.internalGetMutableSkillMap().clear();
                this.guid_ = 0L;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return AvatarSkillInfoNotifyOuterClass.internal_static_AvatarSkillInfoNotify_descriptor;
            }
            
            @Override
            public AvatarSkillInfoNotify getDefaultInstanceForType() {
                return AvatarSkillInfoNotify.getDefaultInstance();
            }
            
            @Override
            public AvatarSkillInfoNotify build() {
                final AvatarSkillInfoNotify result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public AvatarSkillInfoNotify buildPartial() {
                final AvatarSkillInfoNotify result = new AvatarSkillInfoNotify(this);
                final int from_bitField0_ = this.bitField0_;
                (result.skillMap_ = this.internalGetSkillMap()).makeImmutable();
                result.guid_ = this.guid_;
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
                if (other instanceof AvatarSkillInfoNotify) {
                    return this.mergeFrom((AvatarSkillInfoNotify)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final AvatarSkillInfoNotify other) {
                if (other == AvatarSkillInfoNotify.getDefaultInstance()) {
                    return this;
                }
                this.internalGetMutableSkillMap().mergeFrom(other.internalGetSkillMap());
                if (other.getGuid() != 0L) {
                    this.setGuid(other.getGuid());
                }
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
                AvatarSkillInfoNotify parsedMessage = null;
                try {
                    parsedMessage = AvatarSkillInfoNotify.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (AvatarSkillInfoNotify)e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                }
                finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            
            private MapField<Integer, AvatarSkillInfoOuterClass.AvatarSkillInfo> internalGetSkillMap() {
                if (this.skillMap_ == null) {
                    return MapField.emptyMapField(SkillMapDefaultEntryHolder.defaultEntry);
                }
                return this.skillMap_;
            }
            
            private MapField<Integer, AvatarSkillInfoOuterClass.AvatarSkillInfo> internalGetMutableSkillMap() {
                this.onChanged();
                if (this.skillMap_ == null) {
                    this.skillMap_ = MapField.newMapField(SkillMapDefaultEntryHolder.defaultEntry);
                }
                if (!this.skillMap_.isMutable()) {
                    this.skillMap_ = this.skillMap_.copy();
                }
                return this.skillMap_;
            }
            
            @Override
            public int getSkillMapCount() {
                return this.internalGetSkillMap().getMap().size();
            }
            
            @Override
            public boolean containsSkillMap(final int key) {
                return this.internalGetSkillMap().getMap().containsKey(key);
            }
            
            @Deprecated
            @Override
            public Map<Integer, AvatarSkillInfoOuterClass.AvatarSkillInfo> getSkillMap() {
                return this.getSkillMapMap();
            }
            
            @Override
            public Map<Integer, AvatarSkillInfoOuterClass.AvatarSkillInfo> getSkillMapMap() {
                return this.internalGetSkillMap().getMap();
            }
            
            @Override
            public AvatarSkillInfoOuterClass.AvatarSkillInfo getSkillMapOrDefault(final int key, final AvatarSkillInfoOuterClass.AvatarSkillInfo defaultValue) {
                final Map<Integer, AvatarSkillInfoOuterClass.AvatarSkillInfo> map = this.internalGetSkillMap().getMap();
                return map.containsKey(key) ? map.get(key) : defaultValue;
            }
            
            @Override
            public AvatarSkillInfoOuterClass.AvatarSkillInfo getSkillMapOrThrow(final int key) {
                final Map<Integer, AvatarSkillInfoOuterClass.AvatarSkillInfo> map = this.internalGetSkillMap().getMap();
                if (!map.containsKey(key)) {
                    throw new IllegalArgumentException();
                }
                return map.get(key);
            }
            
            public Builder clearSkillMap() {
                this.internalGetMutableSkillMap().getMutableMap().clear();
                return this;
            }
            
            public Builder removeSkillMap(final int key) {
                this.internalGetMutableSkillMap().getMutableMap().remove(key);
                return this;
            }
            
            @Deprecated
            public Map<Integer, AvatarSkillInfoOuterClass.AvatarSkillInfo> getMutableSkillMap() {
                return this.internalGetMutableSkillMap().getMutableMap();
            }
            
            public Builder putSkillMap(final int key, final AvatarSkillInfoOuterClass.AvatarSkillInfo value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.internalGetMutableSkillMap().getMutableMap().put(key, value);
                return this;
            }
            
            public Builder putAllSkillMap(final Map<Integer, AvatarSkillInfoOuterClass.AvatarSkillInfo> values) {
                this.internalGetMutableSkillMap().getMutableMap().putAll(values);
                return this;
            }
            
            @Override
            public long getGuid() {
                return this.guid_;
            }
            
            public Builder setGuid(final long value) {
                this.guid_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearGuid() {
                this.guid_ = 0L;
                this.onChanged();
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
    
    public interface AvatarSkillInfoNotifyOrBuilder extends MessageOrBuilder
    {
        int getSkillMapCount();
        
        boolean containsSkillMap(final int p0);
        
        @Deprecated
        Map<Integer, AvatarSkillInfoOuterClass.AvatarSkillInfo> getSkillMap();
        
        Map<Integer, AvatarSkillInfoOuterClass.AvatarSkillInfo> getSkillMapMap();
        
        AvatarSkillInfoOuterClass.AvatarSkillInfo getSkillMapOrDefault(final int p0, final AvatarSkillInfoOuterClass.AvatarSkillInfo p1);
        
        AvatarSkillInfoOuterClass.AvatarSkillInfo getSkillMapOrThrow(final int p0);
        
        long getGuid();
    }
}
