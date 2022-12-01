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

public final class BattlePassRewardTagOuterClass
{
    private static final Descriptors.Descriptor internal_static_BattlePassRewardTag_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_BattlePassRewardTag_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private BattlePassRewardTagOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return BattlePassRewardTagOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0019BattlePassRewardTag.proto\u001a\u001cBattlePassUnlockStatus.proto\"g\n\u0013BattlePassRewardTag\u0012\r\n\u0005level\u0018\u0004 \u0001(\r\u0012.\n\runlock_status\u0018\u0002 \u0001(\u000e2\u0017.BattlePassUnlockStatus\u0012\u0011\n\treward_id\u0018\u0007 \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        BattlePassRewardTagOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { BattlePassUnlockStatusOuterClass.getDescriptor() });
        internal_static_BattlePassRewardTag_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_BattlePassRewardTag_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(BattlePassRewardTagOuterClass.internal_static_BattlePassRewardTag_descriptor, new String[] { "Level", "UnlockStatus", "RewardId" });
        BattlePassUnlockStatusOuterClass.getDescriptor();
    }
    
    public static final class BattlePassRewardTag extends GeneratedMessageV3 implements BattlePassRewardTagOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int LEVEL_FIELD_NUMBER = 4;
        private int level_;
        public static final int UNLOCK_STATUS_FIELD_NUMBER = 2;
        private int unlockStatus_;
        public static final int REWARD_ID_FIELD_NUMBER = 7;
        private int rewardId_;
        private byte memoizedIsInitialized;
        private static final BattlePassRewardTag DEFAULT_INSTANCE;
        private static final Parser<BattlePassRewardTag> PARSER;
        
        private BattlePassRewardTag(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private BattlePassRewardTag() {
            this.memoizedIsInitialized = -1;
            this.unlockStatus_ = 0;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new BattlePassRewardTag();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private BattlePassRewardTag(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 16: {
                            final int rawValue = input.readEnum();
                            this.unlockStatus_ = rawValue;
                            continue;
                        }
                        case 32: {
                            this.level_ = input.readUInt32();
                            continue;
                        }
                        case 56: {
                            this.rewardId_ = input.readUInt32();
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
            return BattlePassRewardTagOuterClass.internal_static_BattlePassRewardTag_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return BattlePassRewardTagOuterClass.internal_static_BattlePassRewardTag_fieldAccessorTable.ensureFieldAccessorsInitialized(BattlePassRewardTag.class, Builder.class);
        }
        
        @Override
        public int getLevel() {
            return this.level_;
        }
        
        @Override
        public int getUnlockStatusValue() {
            return this.unlockStatus_;
        }
        
        @Override
        public BattlePassUnlockStatusOuterClass.BattlePassUnlockStatus getUnlockStatus() {
            final BattlePassUnlockStatusOuterClass.BattlePassUnlockStatus result = BattlePassUnlockStatusOuterClass.BattlePassUnlockStatus.valueOf(this.unlockStatus_);
            return (result == null) ? BattlePassUnlockStatusOuterClass.BattlePassUnlockStatus.UNRECOGNIZED : result;
        }
        
        @Override
        public int getRewardId() {
            return this.rewardId_;
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
            if (this.unlockStatus_ != BattlePassUnlockStatusOuterClass.BattlePassUnlockStatus.BATTLE_PASS_UNLOCK_STATUS_INVALID.getNumber()) {
                output.writeEnum(2, this.unlockStatus_);
            }
            if (this.level_ != 0) {
                output.writeUInt32(4, this.level_);
            }
            if (this.rewardId_ != 0) {
                output.writeUInt32(7, this.rewardId_);
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
            if (this.unlockStatus_ != BattlePassUnlockStatusOuterClass.BattlePassUnlockStatus.BATTLE_PASS_UNLOCK_STATUS_INVALID.getNumber()) {
                size += CodedOutputStream.computeEnumSize(2, this.unlockStatus_);
            }
            if (this.level_ != 0) {
                size += CodedOutputStream.computeUInt32Size(4, this.level_);
            }
            if (this.rewardId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(7, this.rewardId_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BattlePassRewardTag)) {
                return super.equals(obj);
            }
            final BattlePassRewardTag other = (BattlePassRewardTag)obj;
            return this.getLevel() == other.getLevel() && this.unlockStatus_ == other.unlockStatus_ && this.getRewardId() == other.getRewardId() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 4;
            hash = 53 * hash + this.getLevel();
            hash = 37 * hash + 2;
            hash = 53 * hash + this.unlockStatus_;
            hash = 37 * hash + 7;
            hash = 53 * hash + this.getRewardId();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static BattlePassRewardTag parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return BattlePassRewardTag.PARSER.parseFrom(data);
        }
        
        public static BattlePassRewardTag parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return BattlePassRewardTag.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static BattlePassRewardTag parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return BattlePassRewardTag.PARSER.parseFrom(data);
        }
        
        public static BattlePassRewardTag parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return BattlePassRewardTag.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static BattlePassRewardTag parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return BattlePassRewardTag.PARSER.parseFrom(data);
        }
        
        public static BattlePassRewardTag parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return BattlePassRewardTag.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static BattlePassRewardTag parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(BattlePassRewardTag.PARSER, input);
        }
        
        public static BattlePassRewardTag parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(BattlePassRewardTag.PARSER, input, extensionRegistry);
        }
        
        public static BattlePassRewardTag parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(BattlePassRewardTag.PARSER, input);
        }
        
        public static BattlePassRewardTag parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(BattlePassRewardTag.PARSER, input, extensionRegistry);
        }
        
        public static BattlePassRewardTag parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(BattlePassRewardTag.PARSER, input);
        }
        
        public static BattlePassRewardTag parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(BattlePassRewardTag.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return BattlePassRewardTag.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final BattlePassRewardTag prototype) {
            return BattlePassRewardTag.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == BattlePassRewardTag.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static BattlePassRewardTag getDefaultInstance() {
            return BattlePassRewardTag.DEFAULT_INSTANCE;
        }
        
        public static Parser<BattlePassRewardTag> parser() {
            return BattlePassRewardTag.PARSER;
        }
        
        @Override
        public Parser<BattlePassRewardTag> getParserForType() {
            return BattlePassRewardTag.PARSER;
        }
        
        @Override
        public BattlePassRewardTag getDefaultInstanceForType() {
            return BattlePassRewardTag.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new BattlePassRewardTag();
            PARSER = new AbstractParser<BattlePassRewardTag>() {
                @Override
                public BattlePassRewardTag parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new BattlePassRewardTag(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements BattlePassRewardTagOrBuilder
        {
            private int level_;
            private int unlockStatus_;
            private int rewardId_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return BattlePassRewardTagOuterClass.internal_static_BattlePassRewardTag_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return BattlePassRewardTagOuterClass.internal_static_BattlePassRewardTag_fieldAccessorTable.ensureFieldAccessorsInitialized(BattlePassRewardTag.class, Builder.class);
            }
            
            private Builder() {
                this.unlockStatus_ = 0;
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.unlockStatus_ = 0;
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (BattlePassRewardTag.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.level_ = 0;
                this.unlockStatus_ = 0;
                this.rewardId_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return BattlePassRewardTagOuterClass.internal_static_BattlePassRewardTag_descriptor;
            }
            
            @Override
            public BattlePassRewardTag getDefaultInstanceForType() {
                return BattlePassRewardTag.getDefaultInstance();
            }
            
            @Override
            public BattlePassRewardTag build() {
                final BattlePassRewardTag result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public BattlePassRewardTag buildPartial() {
                final BattlePassRewardTag result = new BattlePassRewardTag(this);
                result.level_ = this.level_;
                result.unlockStatus_ = this.unlockStatus_;
                result.rewardId_ = this.rewardId_;
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
                if (other instanceof BattlePassRewardTag) {
                    return this.mergeFrom((BattlePassRewardTag)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final BattlePassRewardTag other) {
                if (other == BattlePassRewardTag.getDefaultInstance()) {
                    return this;
                }
                if (other.getLevel() != 0) {
                    this.setLevel(other.getLevel());
                }
                if (other.unlockStatus_ != 0) {
                    this.setUnlockStatusValue(other.getUnlockStatusValue());
                }
                if (other.getRewardId() != 0) {
                    this.setRewardId(other.getRewardId());
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
                BattlePassRewardTag parsedMessage = null;
                try {
                    parsedMessage = BattlePassRewardTag.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (BattlePassRewardTag)e.getUnfinishedMessage();
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
            public int getLevel() {
                return this.level_;
            }
            
            public Builder setLevel(final int value) {
                this.level_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearLevel() {
                this.level_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getUnlockStatusValue() {
                return this.unlockStatus_;
            }
            
            public Builder setUnlockStatusValue(final int value) {
                this.unlockStatus_ = value;
                this.onChanged();
                return this;
            }
            
            @Override
            public BattlePassUnlockStatusOuterClass.BattlePassUnlockStatus getUnlockStatus() {
                final BattlePassUnlockStatusOuterClass.BattlePassUnlockStatus result = BattlePassUnlockStatusOuterClass.BattlePassUnlockStatus.valueOf(this.unlockStatus_);
                return (result == null) ? BattlePassUnlockStatusOuterClass.BattlePassUnlockStatus.UNRECOGNIZED : result;
            }
            
            public Builder setUnlockStatus(final BattlePassUnlockStatusOuterClass.BattlePassUnlockStatus value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.unlockStatus_ = value.getNumber();
                this.onChanged();
                return this;
            }
            
            public Builder clearUnlockStatus() {
                this.unlockStatus_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getRewardId() {
                return this.rewardId_;
            }
            
            public Builder setRewardId(final int value) {
                this.rewardId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearRewardId() {
                this.rewardId_ = 0;
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
    
    public interface BattlePassRewardTagOrBuilder extends MessageOrBuilder
    {
        int getLevel();
        
        int getUnlockStatusValue();
        
        BattlePassUnlockStatusOuterClass.BattlePassUnlockStatus getUnlockStatus();
        
        int getRewardId();
    }
}
