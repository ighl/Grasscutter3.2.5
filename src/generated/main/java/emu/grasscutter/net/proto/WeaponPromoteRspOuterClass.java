// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.Message;
import java.io.InputStream;
import com.google.protobuf.ByteString;
import java.nio.ByteBuffer;
import com.google.protobuf.Internal;
import com.google.protobuf.CodedOutputStream;
import java.io.IOException;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Parser;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Descriptors;

public final class WeaponPromoteRspOuterClass
{
    private static final Descriptors.Descriptor internal_static_WeaponPromoteRsp_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_WeaponPromoteRsp_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private WeaponPromoteRspOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return WeaponPromoteRspOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0016WeaponPromoteRsp.proto\"u\n\u0010WeaponPromoteRsp\u0012\u001a\n\u0012target_weapon_guid\u0018\u0003 \u0001(\u0004\u0012\u0019\n\u0011old_promote_level\u0018\u0007 \u0001(\r\u0012\u0019\n\u0011cur_promote_level\u0018\f \u0001(\r\u0012\u000f\n\u0007retcode\u0018\u0004 \u0001(\u0005B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        WeaponPromoteRspOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_WeaponPromoteRsp_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_WeaponPromoteRsp_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(WeaponPromoteRspOuterClass.internal_static_WeaponPromoteRsp_descriptor, new String[] { "TargetWeaponGuid", "OldPromoteLevel", "CurPromoteLevel", "Retcode" });
    }
    
    public static final class WeaponPromoteRsp extends GeneratedMessageV3 implements WeaponPromoteRspOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int TARGET_WEAPON_GUID_FIELD_NUMBER = 3;
        private long targetWeaponGuid_;
        public static final int OLD_PROMOTE_LEVEL_FIELD_NUMBER = 7;
        private int oldPromoteLevel_;
        public static final int CUR_PROMOTE_LEVEL_FIELD_NUMBER = 12;
        private int curPromoteLevel_;
        public static final int RETCODE_FIELD_NUMBER = 4;
        private int retcode_;
        private byte memoizedIsInitialized;
        private static final WeaponPromoteRsp DEFAULT_INSTANCE;
        private static final Parser<WeaponPromoteRsp> PARSER;
        
        private WeaponPromoteRsp(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private WeaponPromoteRsp() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new WeaponPromoteRsp();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private WeaponPromoteRsp(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new NullPointerException();
            }
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
                        case 24: {
                            this.targetWeaponGuid_ = input.readUInt64();
                            continue;
                        }
                        case 32: {
                            this.retcode_ = input.readInt32();
                            continue;
                        }
                        case 56: {
                            this.oldPromoteLevel_ = input.readUInt32();
                            continue;
                        }
                        case 96: {
                            this.curPromoteLevel_ = input.readUInt32();
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
            return WeaponPromoteRspOuterClass.internal_static_WeaponPromoteRsp_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return WeaponPromoteRspOuterClass.internal_static_WeaponPromoteRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(WeaponPromoteRsp.class, Builder.class);
        }
        
        @Override
        public long getTargetWeaponGuid() {
            return this.targetWeaponGuid_;
        }
        
        @Override
        public int getOldPromoteLevel() {
            return this.oldPromoteLevel_;
        }
        
        @Override
        public int getCurPromoteLevel() {
            return this.curPromoteLevel_;
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
            if (this.targetWeaponGuid_ != 0L) {
                output.writeUInt64(3, this.targetWeaponGuid_);
            }
            if (this.retcode_ != 0) {
                output.writeInt32(4, this.retcode_);
            }
            if (this.oldPromoteLevel_ != 0) {
                output.writeUInt32(7, this.oldPromoteLevel_);
            }
            if (this.curPromoteLevel_ != 0) {
                output.writeUInt32(12, this.curPromoteLevel_);
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
            if (this.targetWeaponGuid_ != 0L) {
                size += CodedOutputStream.computeUInt64Size(3, this.targetWeaponGuid_);
            }
            if (this.retcode_ != 0) {
                size += CodedOutputStream.computeInt32Size(4, this.retcode_);
            }
            if (this.oldPromoteLevel_ != 0) {
                size += CodedOutputStream.computeUInt32Size(7, this.oldPromoteLevel_);
            }
            if (this.curPromoteLevel_ != 0) {
                size += CodedOutputStream.computeUInt32Size(12, this.curPromoteLevel_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof WeaponPromoteRsp)) {
                return super.equals(obj);
            }
            final WeaponPromoteRsp other = (WeaponPromoteRsp)obj;
            return this.getTargetWeaponGuid() == other.getTargetWeaponGuid() && this.getOldPromoteLevel() == other.getOldPromoteLevel() && this.getCurPromoteLevel() == other.getCurPromoteLevel() && this.getRetcode() == other.getRetcode() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 3;
            hash = 53 * hash + Internal.hashLong(this.getTargetWeaponGuid());
            hash = 37 * hash + 7;
            hash = 53 * hash + this.getOldPromoteLevel();
            hash = 37 * hash + 12;
            hash = 53 * hash + this.getCurPromoteLevel();
            hash = 37 * hash + 4;
            hash = 53 * hash + this.getRetcode();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static WeaponPromoteRsp parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return WeaponPromoteRsp.PARSER.parseFrom(data);
        }
        
        public static WeaponPromoteRsp parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return WeaponPromoteRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static WeaponPromoteRsp parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return WeaponPromoteRsp.PARSER.parseFrom(data);
        }
        
        public static WeaponPromoteRsp parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return WeaponPromoteRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static WeaponPromoteRsp parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return WeaponPromoteRsp.PARSER.parseFrom(data);
        }
        
        public static WeaponPromoteRsp parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return WeaponPromoteRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static WeaponPromoteRsp parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(WeaponPromoteRsp.PARSER, input);
        }
        
        public static WeaponPromoteRsp parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(WeaponPromoteRsp.PARSER, input, extensionRegistry);
        }
        
        public static WeaponPromoteRsp parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(WeaponPromoteRsp.PARSER, input);
        }
        
        public static WeaponPromoteRsp parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(WeaponPromoteRsp.PARSER, input, extensionRegistry);
        }
        
        public static WeaponPromoteRsp parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(WeaponPromoteRsp.PARSER, input);
        }
        
        public static WeaponPromoteRsp parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(WeaponPromoteRsp.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return WeaponPromoteRsp.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final WeaponPromoteRsp prototype) {
            return WeaponPromoteRsp.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == WeaponPromoteRsp.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static WeaponPromoteRsp getDefaultInstance() {
            return WeaponPromoteRsp.DEFAULT_INSTANCE;
        }
        
        public static Parser<WeaponPromoteRsp> parser() {
            return WeaponPromoteRsp.PARSER;
        }
        
        @Override
        public Parser<WeaponPromoteRsp> getParserForType() {
            return WeaponPromoteRsp.PARSER;
        }
        
        @Override
        public WeaponPromoteRsp getDefaultInstanceForType() {
            return WeaponPromoteRsp.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new WeaponPromoteRsp();
            PARSER = new AbstractParser<WeaponPromoteRsp>() {
                @Override
                public WeaponPromoteRsp parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new WeaponPromoteRsp(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements WeaponPromoteRspOrBuilder
        {
            private long targetWeaponGuid_;
            private int oldPromoteLevel_;
            private int curPromoteLevel_;
            private int retcode_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return WeaponPromoteRspOuterClass.internal_static_WeaponPromoteRsp_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return WeaponPromoteRspOuterClass.internal_static_WeaponPromoteRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(WeaponPromoteRsp.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (WeaponPromoteRsp.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.targetWeaponGuid_ = 0L;
                this.oldPromoteLevel_ = 0;
                this.curPromoteLevel_ = 0;
                this.retcode_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return WeaponPromoteRspOuterClass.internal_static_WeaponPromoteRsp_descriptor;
            }
            
            @Override
            public WeaponPromoteRsp getDefaultInstanceForType() {
                return WeaponPromoteRsp.getDefaultInstance();
            }
            
            @Override
            public WeaponPromoteRsp build() {
                final WeaponPromoteRsp result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public WeaponPromoteRsp buildPartial() {
                final WeaponPromoteRsp result = new WeaponPromoteRsp(this);
                result.targetWeaponGuid_ = this.targetWeaponGuid_;
                result.oldPromoteLevel_ = this.oldPromoteLevel_;
                result.curPromoteLevel_ = this.curPromoteLevel_;
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
                if (other instanceof WeaponPromoteRsp) {
                    return this.mergeFrom((WeaponPromoteRsp)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final WeaponPromoteRsp other) {
                if (other == WeaponPromoteRsp.getDefaultInstance()) {
                    return this;
                }
                if (other.getTargetWeaponGuid() != 0L) {
                    this.setTargetWeaponGuid(other.getTargetWeaponGuid());
                }
                if (other.getOldPromoteLevel() != 0) {
                    this.setOldPromoteLevel(other.getOldPromoteLevel());
                }
                if (other.getCurPromoteLevel() != 0) {
                    this.setCurPromoteLevel(other.getCurPromoteLevel());
                }
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
                WeaponPromoteRsp parsedMessage = null;
                try {
                    parsedMessage = WeaponPromoteRsp.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (WeaponPromoteRsp)e.getUnfinishedMessage();
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
            public long getTargetWeaponGuid() {
                return this.targetWeaponGuid_;
            }
            
            public Builder setTargetWeaponGuid(final long value) {
                this.targetWeaponGuid_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearTargetWeaponGuid() {
                this.targetWeaponGuid_ = 0L;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getOldPromoteLevel() {
                return this.oldPromoteLevel_;
            }
            
            public Builder setOldPromoteLevel(final int value) {
                this.oldPromoteLevel_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearOldPromoteLevel() {
                this.oldPromoteLevel_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getCurPromoteLevel() {
                return this.curPromoteLevel_;
            }
            
            public Builder setCurPromoteLevel(final int value) {
                this.curPromoteLevel_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearCurPromoteLevel() {
                this.curPromoteLevel_ = 0;
                this.onChanged();
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
    
    public interface WeaponPromoteRspOrBuilder extends MessageOrBuilder
    {
        long getTargetWeaponGuid();
        
        int getOldPromoteLevel();
        
        int getCurPromoteLevel();
        
        int getRetcode();
    }
}
