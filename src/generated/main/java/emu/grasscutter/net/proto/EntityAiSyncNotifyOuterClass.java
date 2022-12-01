// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import java.util.Collection;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.Message;
import java.io.InputStream;
import com.google.protobuf.ByteString;
import java.nio.ByteBuffer;
import com.google.protobuf.CodedOutputStream;
import java.io.IOException;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import java.util.ArrayList;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.UnknownFieldSet;
import java.util.Collections;
import com.google.protobuf.Parser;
import java.util.List;
import com.google.protobuf.Internal;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Descriptors;

public final class EntityAiSyncNotifyOuterClass
{
    private static final Descriptors.Descriptor internal_static_EntityAiSyncNotify_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_EntityAiSyncNotify_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private EntityAiSyncNotifyOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return EntityAiSyncNotifyOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0018EntityAiSyncNotify.proto\u001a\u0010AiSyncInfo.proto\"_\n\u0012EntityAiSyncNotify\u0012)\n!local_avatar_alerted_monster_list\u0018\u000f \u0003(\r\u0012\u001e\n\tinfo_list\u0018\u0001 \u0003(\u000b2\u000b.AiSyncInfoB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        EntityAiSyncNotifyOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { AiSyncInfoOuterClass.getDescriptor() });
        internal_static_EntityAiSyncNotify_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_EntityAiSyncNotify_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(EntityAiSyncNotifyOuterClass.internal_static_EntityAiSyncNotify_descriptor, new String[] { "LocalAvatarAlertedMonsterList", "InfoList" });
        AiSyncInfoOuterClass.getDescriptor();
    }
    
    public static final class EntityAiSyncNotify extends GeneratedMessageV3 implements EntityAiSyncNotifyOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int LOCAL_AVATAR_ALERTED_MONSTER_LIST_FIELD_NUMBER = 15;
        private Internal.IntList localAvatarAlertedMonsterList_;
        private int localAvatarAlertedMonsterListMemoizedSerializedSize;
        public static final int INFO_LIST_FIELD_NUMBER = 1;
        private List<AiSyncInfoOuterClass.AiSyncInfo> infoList_;
        private byte memoizedIsInitialized;
        private static final EntityAiSyncNotify DEFAULT_INSTANCE;
        private static final Parser<EntityAiSyncNotify> PARSER;
        
        private EntityAiSyncNotify(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.localAvatarAlertedMonsterListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
        }
        
        private EntityAiSyncNotify() {
            this.localAvatarAlertedMonsterListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
            this.localAvatarAlertedMonsterList_ = GeneratedMessageV3.emptyIntList();
            this.infoList_ = Collections.emptyList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new EntityAiSyncNotify();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private EntityAiSyncNotify(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 10: {
                            if ((mutable_bitField0_ & 0x2) == 0x0) {
                                this.infoList_ = new ArrayList<AiSyncInfoOuterClass.AiSyncInfo>();
                                mutable_bitField0_ |= 0x2;
                            }
                            this.infoList_.add(input.readMessage(AiSyncInfoOuterClass.AiSyncInfo.parser(), extensionRegistry));
                            continue;
                        }
                        case 120: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.localAvatarAlertedMonsterList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.localAvatarAlertedMonsterList_.addInt(input.readUInt32());
                            continue;
                        }
                        case 122: {
                            final int length = input.readRawVarint32();
                            final int limit = input.pushLimit(length);
                            if ((mutable_bitField0_ & 0x1) == 0x0 && input.getBytesUntilLimit() > 0) {
                                this.localAvatarAlertedMonsterList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                this.localAvatarAlertedMonsterList_.addInt(input.readUInt32());
                            }
                            input.popLimit(limit);
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
                if ((mutable_bitField0_ & 0x2) != 0x0) {
                    this.infoList_ = Collections.unmodifiableList((List<? extends AiSyncInfoOuterClass.AiSyncInfo>)this.infoList_);
                }
                if ((mutable_bitField0_ & 0x1) != 0x0) {
                    this.localAvatarAlertedMonsterList_.makeImmutable();
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return EntityAiSyncNotifyOuterClass.internal_static_EntityAiSyncNotify_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return EntityAiSyncNotifyOuterClass.internal_static_EntityAiSyncNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(EntityAiSyncNotify.class, Builder.class);
        }
        
        @Override
        public List<Integer> getLocalAvatarAlertedMonsterListList() {
            return this.localAvatarAlertedMonsterList_;
        }
        
        @Override
        public int getLocalAvatarAlertedMonsterListCount() {
            return this.localAvatarAlertedMonsterList_.size();
        }
        
        @Override
        public int getLocalAvatarAlertedMonsterList(final int index) {
            return this.localAvatarAlertedMonsterList_.getInt(index);
        }
        
        @Override
        public List<AiSyncInfoOuterClass.AiSyncInfo> getInfoListList() {
            return this.infoList_;
        }
        
        @Override
        public List<? extends AiSyncInfoOuterClass.AiSyncInfoOrBuilder> getInfoListOrBuilderList() {
            return this.infoList_;
        }
        
        @Override
        public int getInfoListCount() {
            return this.infoList_.size();
        }
        
        @Override
        public AiSyncInfoOuterClass.AiSyncInfo getInfoList(final int index) {
            return this.infoList_.get(index);
        }
        
        @Override
        public AiSyncInfoOuterClass.AiSyncInfoOrBuilder getInfoListOrBuilder(final int index) {
            return this.infoList_.get(index);
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
            this.getSerializedSize();
            for (int i = 0; i < this.infoList_.size(); ++i) {
                output.writeMessage(1, this.infoList_.get(i));
            }
            if (this.getLocalAvatarAlertedMonsterListList().size() > 0) {
                output.writeUInt32NoTag(122);
                output.writeUInt32NoTag(this.localAvatarAlertedMonsterListMemoizedSerializedSize);
            }
            for (int i = 0; i < this.localAvatarAlertedMonsterList_.size(); ++i) {
                output.writeUInt32NoTag(this.localAvatarAlertedMonsterList_.getInt(i));
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
            for (int i = 0; i < this.infoList_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(1, this.infoList_.get(i));
            }
            int dataSize = 0;
            for (int j = 0; j < this.localAvatarAlertedMonsterList_.size(); ++j) {
                dataSize += CodedOutputStream.computeUInt32SizeNoTag(this.localAvatarAlertedMonsterList_.getInt(j));
            }
            size += dataSize;
            if (!this.getLocalAvatarAlertedMonsterListList().isEmpty()) {
                size = ++size + CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            this.localAvatarAlertedMonsterListMemoizedSerializedSize = dataSize;
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof EntityAiSyncNotify)) {
                return super.equals(obj);
            }
            final EntityAiSyncNotify other = (EntityAiSyncNotify)obj;
            return this.getLocalAvatarAlertedMonsterListList().equals(other.getLocalAvatarAlertedMonsterListList()) && this.getInfoListList().equals(other.getInfoListList()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.getLocalAvatarAlertedMonsterListCount() > 0) {
                hash = 37 * hash + 15;
                hash = 53 * hash + this.getLocalAvatarAlertedMonsterListList().hashCode();
            }
            if (this.getInfoListCount() > 0) {
                hash = 37 * hash + 1;
                hash = 53 * hash + this.getInfoListList().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static EntityAiSyncNotify parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return EntityAiSyncNotify.PARSER.parseFrom(data);
        }
        
        public static EntityAiSyncNotify parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return EntityAiSyncNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static EntityAiSyncNotify parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return EntityAiSyncNotify.PARSER.parseFrom(data);
        }
        
        public static EntityAiSyncNotify parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return EntityAiSyncNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static EntityAiSyncNotify parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return EntityAiSyncNotify.PARSER.parseFrom(data);
        }
        
        public static EntityAiSyncNotify parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return EntityAiSyncNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static EntityAiSyncNotify parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(EntityAiSyncNotify.PARSER, input);
        }
        
        public static EntityAiSyncNotify parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(EntityAiSyncNotify.PARSER, input, extensionRegistry);
        }
        
        public static EntityAiSyncNotify parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(EntityAiSyncNotify.PARSER, input);
        }
        
        public static EntityAiSyncNotify parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(EntityAiSyncNotify.PARSER, input, extensionRegistry);
        }
        
        public static EntityAiSyncNotify parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(EntityAiSyncNotify.PARSER, input);
        }
        
        public static EntityAiSyncNotify parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(EntityAiSyncNotify.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return EntityAiSyncNotify.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final EntityAiSyncNotify prototype) {
            return EntityAiSyncNotify.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == EntityAiSyncNotify.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static EntityAiSyncNotify getDefaultInstance() {
            return EntityAiSyncNotify.DEFAULT_INSTANCE;
        }
        
        public static Parser<EntityAiSyncNotify> parser() {
            return EntityAiSyncNotify.PARSER;
        }
        
        @Override
        public Parser<EntityAiSyncNotify> getParserForType() {
            return EntityAiSyncNotify.PARSER;
        }
        
        @Override
        public EntityAiSyncNotify getDefaultInstanceForType() {
            return EntityAiSyncNotify.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new EntityAiSyncNotify();
            PARSER = new AbstractParser<EntityAiSyncNotify>() {
                @Override
                public EntityAiSyncNotify parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new EntityAiSyncNotify(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements EntityAiSyncNotifyOrBuilder
        {
            private int bitField0_;
            private Internal.IntList localAvatarAlertedMonsterList_;
            private List<AiSyncInfoOuterClass.AiSyncInfo> infoList_;
            private RepeatedFieldBuilderV3<AiSyncInfoOuterClass.AiSyncInfo, AiSyncInfoOuterClass.AiSyncInfo.Builder, AiSyncInfoOuterClass.AiSyncInfoOrBuilder> infoListBuilder_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return EntityAiSyncNotifyOuterClass.internal_static_EntityAiSyncNotify_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return EntityAiSyncNotifyOuterClass.internal_static_EntityAiSyncNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(EntityAiSyncNotify.class, Builder.class);
            }
            
            private Builder() {
                this.localAvatarAlertedMonsterList_ = GeneratedMessageV3.emptyIntList();
                this.infoList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.localAvatarAlertedMonsterList_ = GeneratedMessageV3.emptyIntList();
                this.infoList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (EntityAiSyncNotify.alwaysUseFieldBuilders) {
                    this.getInfoListFieldBuilder();
                }
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.localAvatarAlertedMonsterList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFE;
                if (this.infoListBuilder_ == null) {
                    this.infoList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFD;
                }
                else {
                    this.infoListBuilder_.clear();
                }
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return EntityAiSyncNotifyOuterClass.internal_static_EntityAiSyncNotify_descriptor;
            }
            
            @Override
            public EntityAiSyncNotify getDefaultInstanceForType() {
                return EntityAiSyncNotify.getDefaultInstance();
            }
            
            @Override
            public EntityAiSyncNotify build() {
                final EntityAiSyncNotify result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public EntityAiSyncNotify buildPartial() {
                final EntityAiSyncNotify result = new EntityAiSyncNotify(this);
                final int from_bitField0_ = this.bitField0_;
                if ((this.bitField0_ & 0x1) != 0x0) {
                    this.localAvatarAlertedMonsterList_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                result.localAvatarAlertedMonsterList_ = this.localAvatarAlertedMonsterList_;
                if (this.infoListBuilder_ == null) {
                    if ((this.bitField0_ & 0x2) != 0x0) {
                        this.infoList_ = Collections.unmodifiableList((List<? extends AiSyncInfoOuterClass.AiSyncInfo>)this.infoList_);
                        this.bitField0_ &= 0xFFFFFFFD;
                    }
                    result.infoList_ = this.infoList_;
                }
                else {
                    result.infoList_ = this.infoListBuilder_.build();
                }
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
                if (other instanceof EntityAiSyncNotify) {
                    return this.mergeFrom((EntityAiSyncNotify)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final EntityAiSyncNotify other) {
                if (other == EntityAiSyncNotify.getDefaultInstance()) {
                    return this;
                }
                if (!other.localAvatarAlertedMonsterList_.isEmpty()) {
                    if (this.localAvatarAlertedMonsterList_.isEmpty()) {
                        this.localAvatarAlertedMonsterList_ = other.localAvatarAlertedMonsterList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    else {
                        this.ensureLocalAvatarAlertedMonsterListIsMutable();
                        this.localAvatarAlertedMonsterList_.addAll(other.localAvatarAlertedMonsterList_);
                    }
                    this.onChanged();
                }
                if (this.infoListBuilder_ == null) {
                    if (!other.infoList_.isEmpty()) {
                        if (this.infoList_.isEmpty()) {
                            this.infoList_ = other.infoList_;
                            this.bitField0_ &= 0xFFFFFFFD;
                        }
                        else {
                            this.ensureInfoListIsMutable();
                            this.infoList_.addAll(other.infoList_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.infoList_.isEmpty()) {
                    if (this.infoListBuilder_.isEmpty()) {
                        this.infoListBuilder_.dispose();
                        this.infoListBuilder_ = null;
                        this.infoList_ = other.infoList_;
                        this.bitField0_ &= 0xFFFFFFFD;
                        this.infoListBuilder_ = (EntityAiSyncNotify.alwaysUseFieldBuilders ? this.getInfoListFieldBuilder() : null);
                    }
                    else {
                        this.infoListBuilder_.addAllMessages(other.infoList_);
                    }
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
                EntityAiSyncNotify parsedMessage = null;
                try {
                    parsedMessage = EntityAiSyncNotify.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (EntityAiSyncNotify)e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                }
                finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            
            private void ensureLocalAvatarAlertedMonsterListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.localAvatarAlertedMonsterList_ = GeneratedMessageV3.mutableCopy(this.localAvatarAlertedMonsterList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<Integer> getLocalAvatarAlertedMonsterListList() {
                return ((this.bitField0_ & 0x1) != 0x0) ? Collections.unmodifiableList((List<? extends Integer>)this.localAvatarAlertedMonsterList_) : this.localAvatarAlertedMonsterList_;
            }
            
            @Override
            public int getLocalAvatarAlertedMonsterListCount() {
                return this.localAvatarAlertedMonsterList_.size();
            }
            
            @Override
            public int getLocalAvatarAlertedMonsterList(final int index) {
                return this.localAvatarAlertedMonsterList_.getInt(index);
            }
            
            public Builder setLocalAvatarAlertedMonsterList(final int index, final int value) {
                this.ensureLocalAvatarAlertedMonsterListIsMutable();
                this.localAvatarAlertedMonsterList_.setInt(index, value);
                this.onChanged();
                return this;
            }
            
            public Builder addLocalAvatarAlertedMonsterList(final int value) {
                this.ensureLocalAvatarAlertedMonsterListIsMutable();
                this.localAvatarAlertedMonsterList_.addInt(value);
                this.onChanged();
                return this;
            }
            
            public Builder addAllLocalAvatarAlertedMonsterList(final Iterable<? extends Integer> values) {
                this.ensureLocalAvatarAlertedMonsterListIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.localAvatarAlertedMonsterList_);
                this.onChanged();
                return this;
            }
            
            public Builder clearLocalAvatarAlertedMonsterList() {
                this.localAvatarAlertedMonsterList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFE;
                this.onChanged();
                return this;
            }
            
            private void ensureInfoListIsMutable() {
                if ((this.bitField0_ & 0x2) == 0x0) {
                    this.infoList_ = new ArrayList<AiSyncInfoOuterClass.AiSyncInfo>(this.infoList_);
                    this.bitField0_ |= 0x2;
                }
            }
            
            @Override
            public List<AiSyncInfoOuterClass.AiSyncInfo> getInfoListList() {
                if (this.infoListBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends AiSyncInfoOuterClass.AiSyncInfo>)this.infoList_);
                }
                return this.infoListBuilder_.getMessageList();
            }
            
            @Override
            public int getInfoListCount() {
                if (this.infoListBuilder_ == null) {
                    return this.infoList_.size();
                }
                return this.infoListBuilder_.getCount();
            }
            
            @Override
            public AiSyncInfoOuterClass.AiSyncInfo getInfoList(final int index) {
                if (this.infoListBuilder_ == null) {
                    return this.infoList_.get(index);
                }
                return this.infoListBuilder_.getMessage(index);
            }
            
            public Builder setInfoList(final int index, final AiSyncInfoOuterClass.AiSyncInfo value) {
                if (this.infoListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureInfoListIsMutable();
                    this.infoList_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.infoListBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setInfoList(final int index, final AiSyncInfoOuterClass.AiSyncInfo.Builder builderForValue) {
                if (this.infoListBuilder_ == null) {
                    this.ensureInfoListIsMutable();
                    this.infoList_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.infoListBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addInfoList(final AiSyncInfoOuterClass.AiSyncInfo value) {
                if (this.infoListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureInfoListIsMutable();
                    this.infoList_.add(value);
                    this.onChanged();
                }
                else {
                    this.infoListBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addInfoList(final int index, final AiSyncInfoOuterClass.AiSyncInfo value) {
                if (this.infoListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureInfoListIsMutable();
                    this.infoList_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.infoListBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addInfoList(final AiSyncInfoOuterClass.AiSyncInfo.Builder builderForValue) {
                if (this.infoListBuilder_ == null) {
                    this.ensureInfoListIsMutable();
                    this.infoList_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.infoListBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addInfoList(final int index, final AiSyncInfoOuterClass.AiSyncInfo.Builder builderForValue) {
                if (this.infoListBuilder_ == null) {
                    this.ensureInfoListIsMutable();
                    this.infoList_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.infoListBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllInfoList(final Iterable<? extends AiSyncInfoOuterClass.AiSyncInfo> values) {
                if (this.infoListBuilder_ == null) {
                    this.ensureInfoListIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.infoList_);
                    this.onChanged();
                }
                else {
                    this.infoListBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearInfoList() {
                if (this.infoListBuilder_ == null) {
                    this.infoList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFD;
                    this.onChanged();
                }
                else {
                    this.infoListBuilder_.clear();
                }
                return this;
            }
            
            public Builder removeInfoList(final int index) {
                if (this.infoListBuilder_ == null) {
                    this.ensureInfoListIsMutable();
                    this.infoList_.remove(index);
                    this.onChanged();
                }
                else {
                    this.infoListBuilder_.remove(index);
                }
                return this;
            }
            
            public AiSyncInfoOuterClass.AiSyncInfo.Builder getInfoListBuilder(final int index) {
                return this.getInfoListFieldBuilder().getBuilder(index);
            }
            
            @Override
            public AiSyncInfoOuterClass.AiSyncInfoOrBuilder getInfoListOrBuilder(final int index) {
                if (this.infoListBuilder_ == null) {
                    return this.infoList_.get(index);
                }
                return this.infoListBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends AiSyncInfoOuterClass.AiSyncInfoOrBuilder> getInfoListOrBuilderList() {
                if (this.infoListBuilder_ != null) {
                    return this.infoListBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends AiSyncInfoOuterClass.AiSyncInfoOrBuilder>)this.infoList_);
            }
            
            public AiSyncInfoOuterClass.AiSyncInfo.Builder addInfoListBuilder() {
                return this.getInfoListFieldBuilder().addBuilder(AiSyncInfoOuterClass.AiSyncInfo.getDefaultInstance());
            }
            
            public AiSyncInfoOuterClass.AiSyncInfo.Builder addInfoListBuilder(final int index) {
                return this.getInfoListFieldBuilder().addBuilder(index, AiSyncInfoOuterClass.AiSyncInfo.getDefaultInstance());
            }
            
            public List<AiSyncInfoOuterClass.AiSyncInfo.Builder> getInfoListBuilderList() {
                return this.getInfoListFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<AiSyncInfoOuterClass.AiSyncInfo, AiSyncInfoOuterClass.AiSyncInfo.Builder, AiSyncInfoOuterClass.AiSyncInfoOrBuilder> getInfoListFieldBuilder() {
                if (this.infoListBuilder_ == null) {
                    this.infoListBuilder_ = new RepeatedFieldBuilderV3<AiSyncInfoOuterClass.AiSyncInfo, AiSyncInfoOuterClass.AiSyncInfo.Builder, AiSyncInfoOuterClass.AiSyncInfoOrBuilder>(this.infoList_, (this.bitField0_ & 0x2) != 0x0, this.getParentForChildren(), this.isClean());
                    this.infoList_ = null;
                }
                return this.infoListBuilder_;
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
    
    public interface EntityAiSyncNotifyOrBuilder extends MessageOrBuilder
    {
        List<Integer> getLocalAvatarAlertedMonsterListList();
        
        int getLocalAvatarAlertedMonsterListCount();
        
        int getLocalAvatarAlertedMonsterList(final int p0);
        
        List<AiSyncInfoOuterClass.AiSyncInfo> getInfoListList();
        
        AiSyncInfoOuterClass.AiSyncInfo getInfoList(final int p0);
        
        int getInfoListCount();
        
        List<? extends AiSyncInfoOuterClass.AiSyncInfoOrBuilder> getInfoListOrBuilderList();
        
        AiSyncInfoOuterClass.AiSyncInfoOrBuilder getInfoListOrBuilder(final int p0);
    }
}
