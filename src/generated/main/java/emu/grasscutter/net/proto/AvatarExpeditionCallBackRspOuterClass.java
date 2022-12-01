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

public final class AvatarExpeditionCallBackRspOuterClass
{
    private static final Descriptors.Descriptor internal_static_AvatarExpeditionCallBackRsp_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_AvatarExpeditionCallBackRsp_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_AvatarExpeditionCallBackRsp_ExpeditionInfoMapEntry_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_AvatarExpeditionCallBackRsp_ExpeditionInfoMapEntry_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private AvatarExpeditionCallBackRspOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return AvatarExpeditionCallBackRspOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n!AvatarExpeditionCallBackRsp.proto\u001a\u001aAvatarExpeditionInfo.proto\"\u00d1\u0001\n\u001bAvatarExpeditionCallBackRsp\u0012P\n\u0013expedition_info_map\u0018\t \u0003(\u000b23.AvatarExpeditionCallBackRsp.ExpeditionInfoMapEntry\u0012\u000f\n\u0007retcode\u0018\u0005 \u0001(\u0005\u001aO\n\u0016ExpeditionInfoMapEntry\u0012\u000b\n\u0003key\u0018\u0001 \u0001(\u0004\u0012$\n\u0005value\u0018\u0002 \u0001(\u000b2\u0015.AvatarExpeditionInfo:\u00028\u0001B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        AvatarExpeditionCallBackRspOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { AvatarExpeditionInfoOuterClass.getDescriptor() });
        internal_static_AvatarExpeditionCallBackRsp_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_AvatarExpeditionCallBackRsp_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(AvatarExpeditionCallBackRspOuterClass.internal_static_AvatarExpeditionCallBackRsp_descriptor, new String[] { "ExpeditionInfoMap", "Retcode" });
        internal_static_AvatarExpeditionCallBackRsp_ExpeditionInfoMapEntry_descriptor = AvatarExpeditionCallBackRspOuterClass.internal_static_AvatarExpeditionCallBackRsp_descriptor.getNestedTypes().get(0);
        internal_static_AvatarExpeditionCallBackRsp_ExpeditionInfoMapEntry_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(AvatarExpeditionCallBackRspOuterClass.internal_static_AvatarExpeditionCallBackRsp_ExpeditionInfoMapEntry_descriptor, new String[] { "Key", "Value" });
        AvatarExpeditionInfoOuterClass.getDescriptor();
    }
    
    public static final class AvatarExpeditionCallBackRsp extends GeneratedMessageV3 implements AvatarExpeditionCallBackRspOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int EXPEDITION_INFO_MAP_FIELD_NUMBER = 9;
        private MapField<Long, AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo> expeditionInfoMap_;
        public static final int RETCODE_FIELD_NUMBER = 5;
        private int retcode_;
        private byte memoizedIsInitialized;
        private static final AvatarExpeditionCallBackRsp DEFAULT_INSTANCE;
        private static final Parser<AvatarExpeditionCallBackRsp> PARSER;
        
        private AvatarExpeditionCallBackRsp(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private AvatarExpeditionCallBackRsp() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new AvatarExpeditionCallBackRsp();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private AvatarExpeditionCallBackRsp(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 40: {
                            this.retcode_ = input.readInt32();
                            continue;
                        }
                        case 74: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.expeditionInfoMap_ = MapField.newMapField(ExpeditionInfoMapDefaultEntryHolder.defaultEntry);
                                mutable_bitField0_ |= 0x1;
                            }
                            final MapEntry<Long, AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo> expeditionInfoMap__ = input.readMessage(ExpeditionInfoMapDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
                            this.expeditionInfoMap_.getMutableMap().put(expeditionInfoMap__.getKey(), expeditionInfoMap__.getValue());
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
            return AvatarExpeditionCallBackRspOuterClass.internal_static_AvatarExpeditionCallBackRsp_descriptor;
        }
        
        @Override
        protected MapField internalGetMapField(final int number) {
            switch (number) {
                case 9: {
                    return this.internalGetExpeditionInfoMap();
                }
                default: {
                    throw new RuntimeException("Invalid map field number: " + number);
                }
            }
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return AvatarExpeditionCallBackRspOuterClass.internal_static_AvatarExpeditionCallBackRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(AvatarExpeditionCallBackRsp.class, Builder.class);
        }
        
        private MapField<Long, AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo> internalGetExpeditionInfoMap() {
            if (this.expeditionInfoMap_ == null) {
                return MapField.emptyMapField(ExpeditionInfoMapDefaultEntryHolder.defaultEntry);
            }
            return this.expeditionInfoMap_;
        }
        
        @Override
        public int getExpeditionInfoMapCount() {
            return this.internalGetExpeditionInfoMap().getMap().size();
        }
        
        @Override
        public boolean containsExpeditionInfoMap(final long key) {
            return this.internalGetExpeditionInfoMap().getMap().containsKey(key);
        }
        
        @Deprecated
        @Override
        public Map<Long, AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo> getExpeditionInfoMap() {
            return this.getExpeditionInfoMapMap();
        }
        
        @Override
        public Map<Long, AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo> getExpeditionInfoMapMap() {
            return this.internalGetExpeditionInfoMap().getMap();
        }
        
        @Override
        public AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo getExpeditionInfoMapOrDefault(final long key, final AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo defaultValue) {
            final Map<Long, AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo> map = this.internalGetExpeditionInfoMap().getMap();
            return map.containsKey(key) ? map.get(key) : defaultValue;
        }
        
        @Override
        public AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo getExpeditionInfoMapOrThrow(final long key) {
            final Map<Long, AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo> map = this.internalGetExpeditionInfoMap().getMap();
            if (!map.containsKey(key)) {
                throw new IllegalArgumentException();
            }
            return map.get(key);
        }
        
        @Override
        public int getRetcode() {
            return this.retcode_;
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
            if (this.retcode_ != 0) {
                output.writeInt32(5, this.retcode_);
            }
            GeneratedMessageV3.serializeLongMapTo(output, this.internalGetExpeditionInfoMap(), ExpeditionInfoMapDefaultEntryHolder.defaultEntry, 9);
            this.unknownFields.writeTo(output);
        }
        
        @Override
        public int getSerializedSize() {
            int size = this.memoizedSize;
            if (size != -1) {
                return size;
            }
            size = 0;
            if (this.retcode_ != 0) {
                size += CodedOutputStream.computeInt32Size(5, this.retcode_);
            }
            for (final Map.Entry<Long, AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo> entry : this.internalGetExpeditionInfoMap().getMap().entrySet()) {
                final MapEntry<Long, AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo> expeditionInfoMap__ = ExpeditionInfoMapDefaultEntryHolder.defaultEntry.newBuilderForType().setKey(entry.getKey()).setValue(entry.getValue()).build();
                size += CodedOutputStream.computeMessageSize(9, expeditionInfoMap__);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AvatarExpeditionCallBackRsp)) {
                return super.equals(obj);
            }
            final AvatarExpeditionCallBackRsp other = (AvatarExpeditionCallBackRsp)obj;
            return this.internalGetExpeditionInfoMap().equals(other.internalGetExpeditionInfoMap()) && this.getRetcode() == other.getRetcode() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (!this.internalGetExpeditionInfoMap().getMap().isEmpty()) {
                hash = 37 * hash + 9;
                hash = 53 * hash + this.internalGetExpeditionInfoMap().hashCode();
            }
            hash = 37 * hash + 5;
            hash = 53 * hash + this.getRetcode();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static AvatarExpeditionCallBackRsp parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return AvatarExpeditionCallBackRsp.PARSER.parseFrom(data);
        }
        
        public static AvatarExpeditionCallBackRsp parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AvatarExpeditionCallBackRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AvatarExpeditionCallBackRsp parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return AvatarExpeditionCallBackRsp.PARSER.parseFrom(data);
        }
        
        public static AvatarExpeditionCallBackRsp parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AvatarExpeditionCallBackRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AvatarExpeditionCallBackRsp parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return AvatarExpeditionCallBackRsp.PARSER.parseFrom(data);
        }
        
        public static AvatarExpeditionCallBackRsp parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AvatarExpeditionCallBackRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AvatarExpeditionCallBackRsp parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AvatarExpeditionCallBackRsp.PARSER, input);
        }
        
        public static AvatarExpeditionCallBackRsp parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AvatarExpeditionCallBackRsp.PARSER, input, extensionRegistry);
        }
        
        public static AvatarExpeditionCallBackRsp parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(AvatarExpeditionCallBackRsp.PARSER, input);
        }
        
        public static AvatarExpeditionCallBackRsp parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(AvatarExpeditionCallBackRsp.PARSER, input, extensionRegistry);
        }
        
        public static AvatarExpeditionCallBackRsp parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AvatarExpeditionCallBackRsp.PARSER, input);
        }
        
        public static AvatarExpeditionCallBackRsp parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AvatarExpeditionCallBackRsp.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return AvatarExpeditionCallBackRsp.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final AvatarExpeditionCallBackRsp prototype) {
            return AvatarExpeditionCallBackRsp.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == AvatarExpeditionCallBackRsp.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static AvatarExpeditionCallBackRsp getDefaultInstance() {
            return AvatarExpeditionCallBackRsp.DEFAULT_INSTANCE;
        }
        
        public static Parser<AvatarExpeditionCallBackRsp> parser() {
            return AvatarExpeditionCallBackRsp.PARSER;
        }
        
        @Override
        public Parser<AvatarExpeditionCallBackRsp> getParserForType() {
            return AvatarExpeditionCallBackRsp.PARSER;
        }
        
        @Override
        public AvatarExpeditionCallBackRsp getDefaultInstanceForType() {
            return AvatarExpeditionCallBackRsp.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new AvatarExpeditionCallBackRsp();
            PARSER = new AbstractParser<AvatarExpeditionCallBackRsp>() {
                @Override
                public AvatarExpeditionCallBackRsp parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new AvatarExpeditionCallBackRsp(input, extensionRegistry);
                }
            };
        }
        
        private static final class ExpeditionInfoMapDefaultEntryHolder
        {
            static final MapEntry<Long, AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo> defaultEntry;
            
            static {
                defaultEntry = MapEntry.newDefaultInstance(AvatarExpeditionCallBackRspOuterClass.internal_static_AvatarExpeditionCallBackRsp_ExpeditionInfoMapEntry_descriptor, WireFormat.FieldType.UINT64, 0L, WireFormat.FieldType.MESSAGE, AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo.getDefaultInstance());
            }
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AvatarExpeditionCallBackRspOrBuilder
        {
            private int bitField0_;
            private MapField<Long, AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo> expeditionInfoMap_;
            private int retcode_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return AvatarExpeditionCallBackRspOuterClass.internal_static_AvatarExpeditionCallBackRsp_descriptor;
            }
            
            @Override
            protected MapField internalGetMapField(final int number) {
                switch (number) {
                    case 9: {
                        return this.internalGetExpeditionInfoMap();
                    }
                    default: {
                        throw new RuntimeException("Invalid map field number: " + number);
                    }
                }
            }
            
            @Override
            protected MapField internalGetMutableMapField(final int number) {
                switch (number) {
                    case 9: {
                        return this.internalGetMutableExpeditionInfoMap();
                    }
                    default: {
                        throw new RuntimeException("Invalid map field number: " + number);
                    }
                }
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return AvatarExpeditionCallBackRspOuterClass.internal_static_AvatarExpeditionCallBackRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(AvatarExpeditionCallBackRsp.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (AvatarExpeditionCallBackRsp.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.internalGetMutableExpeditionInfoMap().clear();
                this.retcode_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return AvatarExpeditionCallBackRspOuterClass.internal_static_AvatarExpeditionCallBackRsp_descriptor;
            }
            
            @Override
            public AvatarExpeditionCallBackRsp getDefaultInstanceForType() {
                return AvatarExpeditionCallBackRsp.getDefaultInstance();
            }
            
            @Override
            public AvatarExpeditionCallBackRsp build() {
                final AvatarExpeditionCallBackRsp result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public AvatarExpeditionCallBackRsp buildPartial() {
                final AvatarExpeditionCallBackRsp result = new AvatarExpeditionCallBackRsp(this);
                final int from_bitField0_ = this.bitField0_;
                (result.expeditionInfoMap_ = this.internalGetExpeditionInfoMap()).makeImmutable();
                result.retcode_ = this.retcode_;
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
                if (other instanceof AvatarExpeditionCallBackRsp) {
                    return this.mergeFrom((AvatarExpeditionCallBackRsp)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final AvatarExpeditionCallBackRsp other) {
                if (other == AvatarExpeditionCallBackRsp.getDefaultInstance()) {
                    return this;
                }
                this.internalGetMutableExpeditionInfoMap().mergeFrom(other.internalGetExpeditionInfoMap());
                if (other.getRetcode() != 0) {
                    this.setRetcode(other.getRetcode());
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
                AvatarExpeditionCallBackRsp parsedMessage = null;
                try {
                    parsedMessage = AvatarExpeditionCallBackRsp.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (AvatarExpeditionCallBackRsp)e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                }
                finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            
            private MapField<Long, AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo> internalGetExpeditionInfoMap() {
                if (this.expeditionInfoMap_ == null) {
                    return MapField.emptyMapField(ExpeditionInfoMapDefaultEntryHolder.defaultEntry);
                }
                return this.expeditionInfoMap_;
            }
            
            private MapField<Long, AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo> internalGetMutableExpeditionInfoMap() {
                this.onChanged();
                if (this.expeditionInfoMap_ == null) {
                    this.expeditionInfoMap_ = MapField.newMapField(ExpeditionInfoMapDefaultEntryHolder.defaultEntry);
                }
                if (!this.expeditionInfoMap_.isMutable()) {
                    this.expeditionInfoMap_ = this.expeditionInfoMap_.copy();
                }
                return this.expeditionInfoMap_;
            }
            
            @Override
            public int getExpeditionInfoMapCount() {
                return this.internalGetExpeditionInfoMap().getMap().size();
            }
            
            @Override
            public boolean containsExpeditionInfoMap(final long key) {
                return this.internalGetExpeditionInfoMap().getMap().containsKey(key);
            }
            
            @Deprecated
            @Override
            public Map<Long, AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo> getExpeditionInfoMap() {
                return this.getExpeditionInfoMapMap();
            }
            
            @Override
            public Map<Long, AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo> getExpeditionInfoMapMap() {
                return this.internalGetExpeditionInfoMap().getMap();
            }
            
            @Override
            public AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo getExpeditionInfoMapOrDefault(final long key, final AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo defaultValue) {
                final Map<Long, AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo> map = this.internalGetExpeditionInfoMap().getMap();
                return map.containsKey(key) ? map.get(key) : defaultValue;
            }
            
            @Override
            public AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo getExpeditionInfoMapOrThrow(final long key) {
                final Map<Long, AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo> map = this.internalGetExpeditionInfoMap().getMap();
                if (!map.containsKey(key)) {
                    throw new IllegalArgumentException();
                }
                return map.get(key);
            }
            
            public Builder clearExpeditionInfoMap() {
                this.internalGetMutableExpeditionInfoMap().getMutableMap().clear();
                return this;
            }
            
            public Builder removeExpeditionInfoMap(final long key) {
                this.internalGetMutableExpeditionInfoMap().getMutableMap().remove(key);
                return this;
            }
            
            @Deprecated
            public Map<Long, AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo> getMutableExpeditionInfoMap() {
                return this.internalGetMutableExpeditionInfoMap().getMutableMap();
            }
            
            public Builder putExpeditionInfoMap(final long key, final AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.internalGetMutableExpeditionInfoMap().getMutableMap().put(key, value);
                return this;
            }
            
            public Builder putAllExpeditionInfoMap(final Map<Long, AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo> values) {
                this.internalGetMutableExpeditionInfoMap().getMutableMap().putAll(values);
                return this;
            }
            
            @Override
            public int getRetcode() {
                return this.retcode_;
            }
            
            public Builder setRetcode(final int value) {
                this.retcode_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearRetcode() {
                this.retcode_ = 0;
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
    
    public interface AvatarExpeditionCallBackRspOrBuilder extends MessageOrBuilder
    {
        int getExpeditionInfoMapCount();
        
        boolean containsExpeditionInfoMap(final long p0);
        
        @Deprecated
        Map<Long, AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo> getExpeditionInfoMap();
        
        Map<Long, AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo> getExpeditionInfoMapMap();
        
        AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo getExpeditionInfoMapOrDefault(final long p0, final AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo p1);
        
        AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo getExpeditionInfoMapOrThrow(final long p0);
        
        int getRetcode();
    }
}
