// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import java.util.Collections;
import java.util.Collection;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.Message;
import java.io.InputStream;
import com.google.protobuf.ByteString;
import java.nio.ByteBuffer;
import com.google.protobuf.CodedOutputStream;
import java.util.List;
import java.io.IOException;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Parser;
import com.google.protobuf.Internal;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Descriptors;

public final class QuestProgressUpdateNotifyOuterClass
{
    private static final Descriptors.Descriptor internal_static_QuestProgressUpdateNotify_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_QuestProgressUpdateNotify_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private QuestProgressUpdateNotifyOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return QuestProgressUpdateNotifyOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001fQuestProgressUpdateNotify.proto\"g\n\u0019QuestProgressUpdateNotify\u0012\u0010\n\bquest_id\u0018\f \u0001(\r\u0012\u001a\n\u0012fail_progress_list\u0018\u0006 \u0003(\r\u0012\u001c\n\u0014finish_progress_list\u0018\r \u0003(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        QuestProgressUpdateNotifyOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_QuestProgressUpdateNotify_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_QuestProgressUpdateNotify_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(QuestProgressUpdateNotifyOuterClass.internal_static_QuestProgressUpdateNotify_descriptor, new String[] { "QuestId", "FailProgressList", "FinishProgressList" });
    }
    
    public static final class QuestProgressUpdateNotify extends GeneratedMessageV3 implements QuestProgressUpdateNotifyOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int QUEST_ID_FIELD_NUMBER = 12;
        private int questId_;
        public static final int FAIL_PROGRESS_LIST_FIELD_NUMBER = 6;
        private Internal.IntList failProgressList_;
        private int failProgressListMemoizedSerializedSize;
        public static final int FINISH_PROGRESS_LIST_FIELD_NUMBER = 13;
        private Internal.IntList finishProgressList_;
        private int finishProgressListMemoizedSerializedSize;
        private byte memoizedIsInitialized;
        private static final QuestProgressUpdateNotify DEFAULT_INSTANCE;
        private static final Parser<QuestProgressUpdateNotify> PARSER;
        
        private QuestProgressUpdateNotify(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.failProgressListMemoizedSerializedSize = -1;
            this.finishProgressListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
        }
        
        private QuestProgressUpdateNotify() {
            this.failProgressListMemoizedSerializedSize = -1;
            this.finishProgressListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
            this.failProgressList_ = GeneratedMessageV3.emptyIntList();
            this.finishProgressList_ = GeneratedMessageV3.emptyIntList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new QuestProgressUpdateNotify();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private QuestProgressUpdateNotify(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 48: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.failProgressList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.failProgressList_.addInt(input.readUInt32());
                            continue;
                        }
                        case 50: {
                            final int length = input.readRawVarint32();
                            final int limit = input.pushLimit(length);
                            if ((mutable_bitField0_ & 0x1) == 0x0 && input.getBytesUntilLimit() > 0) {
                                this.failProgressList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                this.failProgressList_.addInt(input.readUInt32());
                            }
                            input.popLimit(limit);
                            continue;
                        }
                        case 96: {
                            this.questId_ = input.readUInt32();
                            continue;
                        }
                        case 104: {
                            if ((mutable_bitField0_ & 0x2) == 0x0) {
                                this.finishProgressList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x2;
                            }
                            this.finishProgressList_.addInt(input.readUInt32());
                            continue;
                        }
                        case 106: {
                            final int length = input.readRawVarint32();
                            final int limit = input.pushLimit(length);
                            if ((mutable_bitField0_ & 0x2) == 0x0 && input.getBytesUntilLimit() > 0) {
                                this.finishProgressList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x2;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                this.finishProgressList_.addInt(input.readUInt32());
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
                if ((mutable_bitField0_ & 0x1) != 0x0) {
                    this.failProgressList_.makeImmutable();
                }
                if ((mutable_bitField0_ & 0x2) != 0x0) {
                    this.finishProgressList_.makeImmutable();
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return QuestProgressUpdateNotifyOuterClass.internal_static_QuestProgressUpdateNotify_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return QuestProgressUpdateNotifyOuterClass.internal_static_QuestProgressUpdateNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(QuestProgressUpdateNotify.class, Builder.class);
        }
        
        @Override
        public int getQuestId() {
            return this.questId_;
        }
        
        @Override
        public List<Integer> getFailProgressListList() {
            return this.failProgressList_;
        }
        
        @Override
        public int getFailProgressListCount() {
            return this.failProgressList_.size();
        }
        
        @Override
        public int getFailProgressList(final int index) {
            return this.failProgressList_.getInt(index);
        }
        
        @Override
        public List<Integer> getFinishProgressListList() {
            return this.finishProgressList_;
        }
        
        @Override
        public int getFinishProgressListCount() {
            return this.finishProgressList_.size();
        }
        
        @Override
        public int getFinishProgressList(final int index) {
            return this.finishProgressList_.getInt(index);
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
            if (this.getFailProgressListList().size() > 0) {
                output.writeUInt32NoTag(50);
                output.writeUInt32NoTag(this.failProgressListMemoizedSerializedSize);
            }
            for (int i = 0; i < this.failProgressList_.size(); ++i) {
                output.writeUInt32NoTag(this.failProgressList_.getInt(i));
            }
            if (this.questId_ != 0) {
                output.writeUInt32(12, this.questId_);
            }
            if (this.getFinishProgressListList().size() > 0) {
                output.writeUInt32NoTag(106);
                output.writeUInt32NoTag(this.finishProgressListMemoizedSerializedSize);
            }
            for (int i = 0; i < this.finishProgressList_.size(); ++i) {
                output.writeUInt32NoTag(this.finishProgressList_.getInt(i));
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
            int dataSize = 0;
            for (int i = 0; i < this.failProgressList_.size(); ++i) {
                dataSize += CodedOutputStream.computeUInt32SizeNoTag(this.failProgressList_.getInt(i));
            }
            size += dataSize;
            if (!this.getFailProgressListList().isEmpty()) {
                size = ++size + CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            this.failProgressListMemoizedSerializedSize = dataSize;
            if (this.questId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(12, this.questId_);
            }
            dataSize = 0;
            for (int i = 0; i < this.finishProgressList_.size(); ++i) {
                dataSize += CodedOutputStream.computeUInt32SizeNoTag(this.finishProgressList_.getInt(i));
            }
            size += dataSize;
            if (!this.getFinishProgressListList().isEmpty()) {
                size = ++size + CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            this.finishProgressListMemoizedSerializedSize = dataSize;
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof QuestProgressUpdateNotify)) {
                return super.equals(obj);
            }
            final QuestProgressUpdateNotify other = (QuestProgressUpdateNotify)obj;
            return this.getQuestId() == other.getQuestId() && this.getFailProgressListList().equals(other.getFailProgressListList()) && this.getFinishProgressListList().equals(other.getFinishProgressListList()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 12;
            hash = 53 * hash + this.getQuestId();
            if (this.getFailProgressListCount() > 0) {
                hash = 37 * hash + 6;
                hash = 53 * hash + this.getFailProgressListList().hashCode();
            }
            if (this.getFinishProgressListCount() > 0) {
                hash = 37 * hash + 13;
                hash = 53 * hash + this.getFinishProgressListList().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static QuestProgressUpdateNotify parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return QuestProgressUpdateNotify.PARSER.parseFrom(data);
        }
        
        public static QuestProgressUpdateNotify parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return QuestProgressUpdateNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static QuestProgressUpdateNotify parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return QuestProgressUpdateNotify.PARSER.parseFrom(data);
        }
        
        public static QuestProgressUpdateNotify parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return QuestProgressUpdateNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static QuestProgressUpdateNotify parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return QuestProgressUpdateNotify.PARSER.parseFrom(data);
        }
        
        public static QuestProgressUpdateNotify parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return QuestProgressUpdateNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static QuestProgressUpdateNotify parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(QuestProgressUpdateNotify.PARSER, input);
        }
        
        public static QuestProgressUpdateNotify parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(QuestProgressUpdateNotify.PARSER, input, extensionRegistry);
        }
        
        public static QuestProgressUpdateNotify parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(QuestProgressUpdateNotify.PARSER, input);
        }
        
        public static QuestProgressUpdateNotify parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(QuestProgressUpdateNotify.PARSER, input, extensionRegistry);
        }
        
        public static QuestProgressUpdateNotify parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(QuestProgressUpdateNotify.PARSER, input);
        }
        
        public static QuestProgressUpdateNotify parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(QuestProgressUpdateNotify.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return QuestProgressUpdateNotify.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final QuestProgressUpdateNotify prototype) {
            return QuestProgressUpdateNotify.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == QuestProgressUpdateNotify.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static QuestProgressUpdateNotify getDefaultInstance() {
            return QuestProgressUpdateNotify.DEFAULT_INSTANCE;
        }
        
        public static Parser<QuestProgressUpdateNotify> parser() {
            return QuestProgressUpdateNotify.PARSER;
        }
        
        @Override
        public Parser<QuestProgressUpdateNotify> getParserForType() {
            return QuestProgressUpdateNotify.PARSER;
        }
        
        @Override
        public QuestProgressUpdateNotify getDefaultInstanceForType() {
            return QuestProgressUpdateNotify.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new QuestProgressUpdateNotify();
            PARSER = new AbstractParser<QuestProgressUpdateNotify>() {
                @Override
                public QuestProgressUpdateNotify parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new QuestProgressUpdateNotify(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements QuestProgressUpdateNotifyOrBuilder
        {
            private int bitField0_;
            private int questId_;
            private Internal.IntList failProgressList_;
            private Internal.IntList finishProgressList_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return QuestProgressUpdateNotifyOuterClass.internal_static_QuestProgressUpdateNotify_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return QuestProgressUpdateNotifyOuterClass.internal_static_QuestProgressUpdateNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(QuestProgressUpdateNotify.class, Builder.class);
            }
            
            private Builder() {
                this.failProgressList_ = GeneratedMessageV3.emptyIntList();
                this.finishProgressList_ = GeneratedMessageV3.emptyIntList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.failProgressList_ = GeneratedMessageV3.emptyIntList();
                this.finishProgressList_ = GeneratedMessageV3.emptyIntList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (QuestProgressUpdateNotify.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.questId_ = 0;
                this.failProgressList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFE;
                this.finishProgressList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFD;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return QuestProgressUpdateNotifyOuterClass.internal_static_QuestProgressUpdateNotify_descriptor;
            }
            
            @Override
            public QuestProgressUpdateNotify getDefaultInstanceForType() {
                return QuestProgressUpdateNotify.getDefaultInstance();
            }
            
            @Override
            public QuestProgressUpdateNotify build() {
                final QuestProgressUpdateNotify result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public QuestProgressUpdateNotify buildPartial() {
                final QuestProgressUpdateNotify result = new QuestProgressUpdateNotify(this);
                final int from_bitField0_ = this.bitField0_;
                result.questId_ = this.questId_;
                if ((this.bitField0_ & 0x1) != 0x0) {
                    this.failProgressList_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                result.failProgressList_ = this.failProgressList_;
                if ((this.bitField0_ & 0x2) != 0x0) {
                    this.finishProgressList_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFFFD;
                }
                result.finishProgressList_ = this.finishProgressList_;
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
                if (other instanceof QuestProgressUpdateNotify) {
                    return this.mergeFrom((QuestProgressUpdateNotify)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final QuestProgressUpdateNotify other) {
                if (other == QuestProgressUpdateNotify.getDefaultInstance()) {
                    return this;
                }
                if (other.getQuestId() != 0) {
                    this.setQuestId(other.getQuestId());
                }
                if (!other.failProgressList_.isEmpty()) {
                    if (this.failProgressList_.isEmpty()) {
                        this.failProgressList_ = other.failProgressList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    else {
                        this.ensureFailProgressListIsMutable();
                        this.failProgressList_.addAll(other.failProgressList_);
                    }
                    this.onChanged();
                }
                if (!other.finishProgressList_.isEmpty()) {
                    if (this.finishProgressList_.isEmpty()) {
                        this.finishProgressList_ = other.finishProgressList_;
                        this.bitField0_ &= 0xFFFFFFFD;
                    }
                    else {
                        this.ensureFinishProgressListIsMutable();
                        this.finishProgressList_.addAll(other.finishProgressList_);
                    }
                    this.onChanged();
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
                QuestProgressUpdateNotify parsedMessage = null;
                try {
                    parsedMessage = QuestProgressUpdateNotify.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (QuestProgressUpdateNotify)e.getUnfinishedMessage();
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
            public int getQuestId() {
                return this.questId_;
            }
            
            public Builder setQuestId(final int value) {
                this.questId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearQuestId() {
                this.questId_ = 0;
                this.onChanged();
                return this;
            }
            
            private void ensureFailProgressListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.failProgressList_ = GeneratedMessageV3.mutableCopy(this.failProgressList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<Integer> getFailProgressListList() {
                return ((this.bitField0_ & 0x1) != 0x0) ? Collections.unmodifiableList((List<? extends Integer>)this.failProgressList_) : this.failProgressList_;
            }
            
            @Override
            public int getFailProgressListCount() {
                return this.failProgressList_.size();
            }
            
            @Override
            public int getFailProgressList(final int index) {
                return this.failProgressList_.getInt(index);
            }
            
            public Builder setFailProgressList(final int index, final int value) {
                this.ensureFailProgressListIsMutable();
                this.failProgressList_.setInt(index, value);
                this.onChanged();
                return this;
            }
            
            public Builder addFailProgressList(final int value) {
                this.ensureFailProgressListIsMutable();
                this.failProgressList_.addInt(value);
                this.onChanged();
                return this;
            }
            
            public Builder addAllFailProgressList(final Iterable<? extends Integer> values) {
                this.ensureFailProgressListIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.failProgressList_);
                this.onChanged();
                return this;
            }
            
            public Builder clearFailProgressList() {
                this.failProgressList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFE;
                this.onChanged();
                return this;
            }
            
            private void ensureFinishProgressListIsMutable() {
                if ((this.bitField0_ & 0x2) == 0x0) {
                    this.finishProgressList_ = GeneratedMessageV3.mutableCopy(this.finishProgressList_);
                    this.bitField0_ |= 0x2;
                }
            }
            
            @Override
            public List<Integer> getFinishProgressListList() {
                return ((this.bitField0_ & 0x2) != 0x0) ? Collections.unmodifiableList((List<? extends Integer>)this.finishProgressList_) : this.finishProgressList_;
            }
            
            @Override
            public int getFinishProgressListCount() {
                return this.finishProgressList_.size();
            }
            
            @Override
            public int getFinishProgressList(final int index) {
                return this.finishProgressList_.getInt(index);
            }
            
            public Builder setFinishProgressList(final int index, final int value) {
                this.ensureFinishProgressListIsMutable();
                this.finishProgressList_.setInt(index, value);
                this.onChanged();
                return this;
            }
            
            public Builder addFinishProgressList(final int value) {
                this.ensureFinishProgressListIsMutable();
                this.finishProgressList_.addInt(value);
                this.onChanged();
                return this;
            }
            
            public Builder addAllFinishProgressList(final Iterable<? extends Integer> values) {
                this.ensureFinishProgressListIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.finishProgressList_);
                this.onChanged();
                return this;
            }
            
            public Builder clearFinishProgressList() {
                this.finishProgressList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFD;
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
    
    public interface QuestProgressUpdateNotifyOrBuilder extends MessageOrBuilder
    {
        int getQuestId();
        
        List<Integer> getFailProgressListList();
        
        int getFailProgressListCount();
        
        int getFailProgressList(final int p0);
        
        List<Integer> getFinishProgressListList();
        
        int getFinishProgressListCount();
        
        int getFinishProgressList(final int p0);
    }
}
